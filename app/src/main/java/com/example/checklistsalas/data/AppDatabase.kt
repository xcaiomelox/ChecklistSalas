package com.example.checklistsalas.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.checklistsalas.data.local.dao.SalaDao
import com.example.checklistsalas.data.local.entity.SalaEntity

@Database(
    entities = [SalaEntity::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun salaDao(): SalaDao
}