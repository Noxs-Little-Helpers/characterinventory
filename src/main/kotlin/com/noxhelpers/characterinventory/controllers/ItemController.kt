package com.noxhelpers.characterinventory.controllers

import com.noxhelpers.characterinventory.items.models.dto.CreateItemRequest
import com.noxhelpers.characterinventory.services.ItemService
import lombok.RequiredArgsConstructor
import lombok.extern.slf4j.Slf4j
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.Instant

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("item")
class ItemController(
    val itemService: ItemService
) {
    @PostMapping("/create")
    fun createItem(@RequestBody item: CreateItemRequest): ResponseEntity<String> {
        this.itemService.createItem(item)
        return ResponseEntity<String>(Instant.now().toString(), HttpStatus.CREATED)
    }
}
