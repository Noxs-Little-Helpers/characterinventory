package com.noxhelpers.characterinventory.items.models.dto

import com.noxhelpers.characterinventory.items.models.Item

data class CreateItemRequest(
    val item: Item,
    val assets:List<CreateItemAssetRequest>
)