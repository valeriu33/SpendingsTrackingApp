package com.example.spendingstracking.data

import java.math.BigDecimal
import javax.inject.Inject


// this will be an interface in the future

class SpendingsRepository @Inject constructor() {
    fun getAllSpendings(): List<Spending> {
        return listOf(
            Spending(1, BigDecimal(10), "food"),
            Spending(2, BigDecimal(20), "beer"),
            Spending(3, BigDecimal(15), "sushi"),
        )
    }
}