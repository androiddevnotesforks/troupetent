package com.harnick.troupetent.core.user_data.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.Serializable

@Entity
@Serializable
data class BandcampUserData(
	val profilePictureId: Long? = -1,
	val savedTimestamp: Long = System.currentTimeMillis(),
	@PrimaryKey
	val username: String = "",
	val userToken: Pair<ByteArray, ByteArray>? = null
)
