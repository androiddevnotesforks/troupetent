package com.harnick.troupetent.library.domain.model.bandcamp.collection_items

import com.harnick.troupetent.library.data.remote.bandcamp.collection_items.BandcampCollectionItemEntity
import kotlinx.serialization.Serializable

@Serializable
data class BandcampCollectionItem(
	val bandId: Long,
	val bandName: String,
	val downloadAvailable: Boolean,
	val featuredTrackNumber: Int?,
	val featuredTrackTitle: String,
	val itemArtId: Long,
	val itemId: Long,
	val itemTitle: String,
	val labelName: String?,
	val labelId: Long?,
	val streamableTrackCount: Int,
	val trAlbumType: String
)

fun BandcampCollectionItemEntity.toBandcampCollectionItem(): BandcampCollectionItem {
	return BandcampCollectionItem(
		bandId,
		bandName,
		downloadAvailable,
		featuredTrackNumber,
		featuredTrackTitle,
		itemArtId,
		itemId,
		itemTitle,
		labelName,
		labelId,
		streamableTrackCount,
		trAlbumType
	)
}