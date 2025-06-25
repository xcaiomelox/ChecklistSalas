package com.example.checklistsalas.domain.model

data class Room(
    val id: Int,
    val name: String,
    val site: String,
    val floor: String,
    val state: String,
    val checklistCompleted: Boolean = false
)