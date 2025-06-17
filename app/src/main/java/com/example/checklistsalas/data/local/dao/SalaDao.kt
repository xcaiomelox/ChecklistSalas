package com.example.checklistsalas.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.checklistsalas.data.local.entity.SalaEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface SalaDao {

    @Query("SELECT * FROM salas")
    fun getSalas():
            Flow<List<SalaEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun inserirSala(sala: SalaEntity)

    @Update
    suspend fun atualizarSala(sala: SalaEntity)
}