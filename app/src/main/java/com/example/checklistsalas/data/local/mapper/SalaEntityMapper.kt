package com.example.checklistsalas.data.local.mapper

import com.example.checklistsalas.data.local.entity.SalaEntity
import com.example.checklistsalas.domain.model.Sala

fun SalaEntity.toSala(): Sala {
    return Sala(
        id = id,
        nome = nome,
        site = site,
        andar = andar,
        estado = estado,
        checklistConcluido = checklistConcluido
    )
}

fun Sala.toSalaEntity(): SalaEntity {
    return SalaEntity(
        id = id,
        nome = nome,
        site = site,
        andar = andar,
        estado = estado,
        checklistConcluido = checklistConcluido

    )
}