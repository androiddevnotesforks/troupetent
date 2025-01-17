package com.harnick.troupetent.library.data.remote.bandcamp.collection_items

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UrlHintsEntity(
	@SerialName("custom_domain")
	val customDomainName: String?,
	@SerialName("custom_domain_verified")
	val customDomainIsVerified: Boolean?,
	@SerialName("item_type")
	val itemType: String,
	val slug: String,
	val subdomain: String
)
