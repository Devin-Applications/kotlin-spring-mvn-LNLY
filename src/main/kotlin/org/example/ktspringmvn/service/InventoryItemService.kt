package org.example.ktspringmvn.service

import org.example.ktspringmvn.model.InventoryItem
import org.example.ktspringmvn.repository.InventoryItemRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class InventoryItemService(@Autowired private val repository: InventoryItemRepository) {

    fun getAllItems(): Flux<InventoryItem> {
        return repository.findAll()
    }

    fun getItemById(id: Long): Mono<InventoryItem> {
        return repository.findById(id)
    }

    fun createItem(item: InventoryItem): Mono<InventoryItem> {
        return repository.save(item)
    }

    fun updateItem(id: Long, updatedItem: InventoryItem): Mono<InventoryItem> {
        return repository.findById(id)
            .flatMap { existingItem ->
                val itemToSave = existingItem.copy(
                    name = updatedItem.name,
                    description = updatedItem.description,
                    price = updatedItem.price,
                    quantity = updatedItem.quantity
                )
                repository.save(itemToSave)
            }
    }

    fun deleteItem(id: Long): Mono<Void> {
        return repository.deleteById(id)
    }
}
