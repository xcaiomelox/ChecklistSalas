package com.example.checklistsalas.data.repository

import com.example.checklistsalas.data.local.dao.SalaDao
import com.example.checklistsalas.data.local.mapper.toSala
import com.example.checklistsalas.data.local.mapper.toSalaEntity
import com.example.checklistsalas.domain.model.Sala
import com.example.checklistsalas.domain.repository.SalaRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class SalaRepositoryImpl @Inject
constructor(
    private val salaDao: SalaDao
) : SalaRepository {

    override fun getSalas(): Flow<List<Sala>> {
        return salaDao.getSalas().map { entityList ->
            entityList.map {
                it.toSala()
            }
        }
    }

    override suspend fun atualizarSala(sala: Sala) {
        salaDao.atualizarSala(sala.toSalaEntity())
    }
}