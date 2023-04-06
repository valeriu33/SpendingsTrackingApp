package com.example.spendingstracking.data

import java.math.BigDecimal

data class Spending (
    val id: Int,
    val amount: BigDecimal,
    val description: String
)
