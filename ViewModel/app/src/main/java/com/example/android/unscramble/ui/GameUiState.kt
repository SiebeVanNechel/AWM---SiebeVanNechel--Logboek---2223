package com.example.android.unscramble.ui

import kotlinx.coroutines.flow.MutableStateFlow

data class GameUiState(
    val currentScrambledWord: String = ""
)

// Game UI state
private val _uiState = MutableStateFlow(GameUiState())