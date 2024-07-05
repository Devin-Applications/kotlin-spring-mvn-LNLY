package org.example.ktspringmvn.repository

import org.example.ktspringmvn.model.InventoryItem
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface InventoryItemRepository : ReactiveCrudRepository<InventoryItem, Long>
