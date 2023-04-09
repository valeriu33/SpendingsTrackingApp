package com.example.spendingstracking.spendings

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun AddSpending() {

    Column {
        Text(text = "Name")
        TextField(value = "", onValueChange = { })
        Text(text = "Amount") // This needs to support multiple currencies all the way down to the repo, TODO: Make a task for this
        TextField(value = "", onValueChange = { })
        Row {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Save")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Cancel")
            }
        }
    }

}