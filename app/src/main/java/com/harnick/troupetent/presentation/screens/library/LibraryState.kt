package com.harnick.troupetent.presentation.screens.library

import androidx.compose.material3.SnackbarHostState
import com.harnick.troupetent.domain.model.bandcamp.BandcampLibraryData

data class LibraryState(
	val errorMessage: String? = null,
	val bandcampLibraryData: BandcampLibraryData? = null,
	val headerGreeting: String,
	val snackbarText: String? = null,
	val snackbarState: SnackbarHostState = SnackbarHostState(),
	val statusMessage: String? = null,
	val username: String? = null,
	val userDataLoading: Boolean = true,
	val userProfilePictureId: Long? = null
)