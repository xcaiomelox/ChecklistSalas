package com.example.checklistsalas.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "rooms")
class RoomEntity (
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val site: String,
    val floor: String,
    val state: String,
    val checklistCompleted: Boolean = false,
)
