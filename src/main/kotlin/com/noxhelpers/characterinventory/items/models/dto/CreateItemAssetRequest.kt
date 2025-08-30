package com.noxhelpers.characterinventory.items.models.dto

data class CreateItemAssetRequest(
    val link: String?,
    val source: String?,
    val data: ByteArray?,
)