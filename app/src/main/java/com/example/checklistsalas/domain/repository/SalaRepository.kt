package com.example.checklistsalas.domain.repository
import kotlinx.coroutines.flow.Flow
import com.example.checklistsalas.domain.model.Sala

interface SalaRepository {
    fun getSalas(): Flow<List<Sala>>
    suspend fun atualizarSala(sala: Sala)
}