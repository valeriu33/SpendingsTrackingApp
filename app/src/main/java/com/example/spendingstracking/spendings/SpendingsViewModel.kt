package com.example.spendingstracking.spendings

import androidx.lifecycle.ViewModel
import com.example.spendingstracking.data.Spending
import com.example.spendingstracking.data.SpendingsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import java.math.BigDecimal
import javax.inject.Inject

@HiltViewModel
open class SpendingsViewModel @Inject constructor(
    private val repository: SpendingsRepository
): ViewModel() {
    open fun getAllSpendings(): List<Spending> {
        return repository.getAllSpendings()
    }
}

class PreviewSpendingsViewModel: SpendingsViewModel(SpendingsRepository()) {
    override fun getAllSpendings(): List<Spending>{
        return listOf(
            Spending(1, BigDecimal(10), "food"),
            Spending(2, BigDecimal(20), "beer"),
            Spending(3, BigDecimal(15), "sushi"),
        )
    }
}