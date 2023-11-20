package com.faroukabichou.kotlincleanarch.recmmended.presentation.state

import com.faroukabichou.kotlincleanarch.cat.domain.Cat

data class CatState(
    val isSuccess: Boolean = false,
    val isLoading: Boolean = false,
    val isFailure: Boolean = false,
    val cat: List<Cat> = emptyList()
)