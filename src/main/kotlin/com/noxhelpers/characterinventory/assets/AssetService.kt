package com.noxhelpers.characterinventory.assets

import lombok.RequiredArgsConstructor
import org.springframework.stereotype.Service
import software.amazon.awssdk.services.s3.S3Client
import software.amazon.awssdk.services.s3.model.Bucket
import software.amazon.awssdk.services.s3.model.ListBucketsRequest
import java.util.function.Consumer


@Service
@RequiredArgsConstructor
class AssetService(
    val s3Client: S3Client
) {

    fun testConnection() {

    }

    private fun listBuckets(): MutableList<Bucket?> {
        val allBuckets: MutableList<Bucket?> = ArrayList()
        var nextToken: String? = null

        do {
            val continuationToken = nextToken
            val listBucketsResponse = s3Client.listBuckets(
                Consumer { request: ListBucketsRequest.Builder? -> request!!.continuationToken(continuationToken) }
            )

            allBuckets.addAll(listBucketsResponse.buckets())
            nextToken = listBucketsResponse.continuationToken()
        } while (nextToken != null)
        return allBuckets
    }

}