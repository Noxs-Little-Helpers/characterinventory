package com.noxhelpers.characterinventory.items.models

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class Item(
    val id: String?,
    val names: List<Translation>,
    val links: List<ItemLink>,
    val tags: List<ItemTag>,
    val type: ItemType
)
