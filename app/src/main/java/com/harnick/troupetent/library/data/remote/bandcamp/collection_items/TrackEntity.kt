package com.harnick.troupetent.library.data.remote.bandcamp.collection_items

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TrackEntity(
	val artist: String,
	val duration: Double,
	@SerialName("file")
	val streamUrl: Map<String, String>,
	val id: Long,
	val title: String,
	@SerialName("track_number")
	val trackNumber: Int?
)