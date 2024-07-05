package org.example.ktspringmvn.model

data class InventoryItem(
    val id: Long,
    val name: String,
    val description: String,
    val price: Double,
    val quantity: Int
)
