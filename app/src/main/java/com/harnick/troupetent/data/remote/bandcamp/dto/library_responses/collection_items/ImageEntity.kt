package com.harnick.troupetent.data.remote.bandcamp.dto.library_responses.collection_items

import kotlinx.serialization.Serializable

@Serializable
data class ImageEntity(
	val height: Int,
	val image_id: Int,
	val width: Int
)