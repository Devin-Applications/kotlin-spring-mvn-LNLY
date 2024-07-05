package org.example.ktspringmvn.controller

import org.example.ktspringmvn.model.InventoryItem
import org.example.ktspringmvn.service.InventoryItemService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/api/inventory")
class InventoryItemController(@Autowired private val service: InventoryItemService) {

    @GetMapping
    fun getAllItems(): Flux<InventoryItem> {
        return service.getAllItems()
    }

    @GetMapping("/{id}")
    fun getItemById(@PathVariable id: Long): Mono<InventoryItem> {
        return service.getItemById(id)
    }

    @PostMapping
    fun createItem(@RequestBody item: InventoryItem): Mono<InventoryItem> {
        return service.createItem(item)
    }

    @PutMapping("/{id}")
    fun updateItem(@PathVariable id: Long, @RequestBody updatedItem: InventoryItem): Mono<InventoryItem> {
        return service.updateItem(id, updatedItem)
    }

    @DeleteMapping("/{id}")
    fun deleteItem(@PathVariable id: Long): Mono<Void> {
        return service.deleteItem(id)
    }
}
