package com.example.spendingstracking

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.spendingstracking.spendings.SpendingsList
import com.example.spendingstracking.spendings.SpendingsViewModel
import com.example.spendingstracking.ui.theme.SpendingsTrackingTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private val exampleViewModel: SpendingsViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("myTag", exampleViewModel.getAllSpendings()[0].description);
        setContent {
            SpendingsTrackingTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {
                    SpendingsList(
                        exampleViewModel
                    )
                }
            }
        }
    }
}