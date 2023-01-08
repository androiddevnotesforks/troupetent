package com.harnick.troupetent.data.remote.bandcamp.dto.library_responses.collection_summary

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TralbumLookupEntity(
	@SerialName("item_type")
	val itemType: String,
	@SerialName("item_id")
	val itemId: Long,
	@SerialName("band_id")
	val bandId: Long,
	@SerialName("purchased")
	val datePurchased: String
)