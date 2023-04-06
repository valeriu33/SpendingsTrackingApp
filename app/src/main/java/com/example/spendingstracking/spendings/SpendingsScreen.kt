package com.example.spendingstracking.spendings

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

import com.example.spendingstracking.ui.theme.SpendingsTrackingTheme
import com.example.spendingstracking.R
import com.example.spendingstracking.data.Spending

@Composable
fun SpendingsList(
    viewModel: SpendingsViewModel
) {
    LazyColumn {
        items(viewModel.getAllSpendings()) {spending ->
            SpendingItem(spending)
        }
    }

}

@Composable
fun SpendingItem(spending: Spending) {
    Row(modifier = Modifier.padding(all = 8.dp)) {
        Image(
            painter = painterResource(id = (R.drawable.baseline_fastfood_24)),
            contentDescription = "spendingIcon",
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column {
            Text(
                text = spending.description
            )
            Text(
                text = spending.amount.toString()
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SpendingsTrackingTheme {
        Surface {
            SpendingsList(
                PreviewSpendingsViewModel()
            )
        }
    }
}