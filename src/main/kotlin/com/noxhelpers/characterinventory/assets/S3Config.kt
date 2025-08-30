package com.noxhelpers.characterinventory.assets

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "storage.credentials")
data class S3Config(
    val accessKey: String,
    val secretKey: String,
    val region: String,
)
