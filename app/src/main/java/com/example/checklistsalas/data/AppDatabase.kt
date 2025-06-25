package com.example.checklistsalas.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.checklistsalas.data.local.dao.RoomDao
import com.example.checklistsalas.data.local.entity.RoomEntity

@Database(
    entities = [RoomEntity::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun roomDao(): RoomDao
}