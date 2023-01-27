package com.harnick.troupetent.library.domain.bandcamp

import com.harnick.troupetent.library.data.dto.collection_summary.CollectionSummaryEntity
import com.harnick.troupetent.library.data.dto.collection_summary.TralbumLookupEntity
import kotlinx.serialization.Serializable

@Serializable
data class BandcampCollectionSummary(
	val fanId: Long,
	val itemLookupList: Map<String, TralbumLookupEntity>,
	val username: String
)

fun CollectionSummaryEntity.toBandcampCollectionSummary(): BandcampCollectionSummary {
	return BandcampCollectionSummary(
		fanId,
		itemLookupList,
		fanUsername
	)
}