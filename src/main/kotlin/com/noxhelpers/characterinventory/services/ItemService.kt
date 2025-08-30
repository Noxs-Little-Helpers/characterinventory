package com.noxhelpers.characterinventory.services

import com.noxhelpers.characterinventory.assets.AssetService
import com.noxhelpers.characterinventory.items.models.Item
import com.noxhelpers.characterinventory.items.models.dto.CreateItemRequest
import lombok.RequiredArgsConstructor
import org.springframework.stereotype.Service
import java.util.Optional

@Service
@RequiredArgsConstructor
class ItemService(
    assetService: AssetService
) {

    fun createItem(item: CreateItemRequest): Optional<Item> {

        return Optional.empty()
    }
}