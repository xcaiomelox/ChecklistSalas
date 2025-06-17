package com.example.checklistsalas.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "salas")
class SalaEntity (
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val nome: String,
    val site: String,
    val andar: String,
    val estado: String,
    val checklistConcluido: Boolean = false
)
