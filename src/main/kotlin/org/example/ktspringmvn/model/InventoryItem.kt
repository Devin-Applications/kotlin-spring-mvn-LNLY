package org.example.ktspringmvn.model

import org.springframework.data.annotation.Id

data class InventoryItem(
    @Id val id: Long,
    val name: String,
    val description: String,
    val price: Double,
    val quantity: Int
)
