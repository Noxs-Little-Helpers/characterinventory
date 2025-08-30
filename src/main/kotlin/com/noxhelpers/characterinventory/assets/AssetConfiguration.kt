package com.noxhelpers.characterinventory.assets

import lombok.RequiredArgsConstructor
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import software.amazon.awssdk.auth.credentials.AwsBasicCredentials
import software.amazon.awssdk.auth.credentials.AwsCredentials
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider
import software.amazon.awssdk.regions.Region
import software.amazon.awssdk.services.s3.S3Client


@Configuration
@RequiredArgsConstructor
class AssetConfiguration(
    val s3Config: S3Config
) {

    @Bean
    fun s3Client(): S3Client {
        val credentials: AwsCredentials = AwsBasicCredentials.create(s3Config.accessKey, s3Config.secretKey)
        return S3Client
            .builder()
            .region(Region.of(s3Config.region))
            .credentialsProvider(StaticCredentialsProvider.create(credentials))
            .build();
    }
}