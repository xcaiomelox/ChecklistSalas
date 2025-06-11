package com.example.checklistsalas.domain.model

data class Sala(
    val id: Int,
    val nome: String,
    val site: String,
    val andar: String,
    val estado: String,
    val checklistConcluido: Boolean = false
)