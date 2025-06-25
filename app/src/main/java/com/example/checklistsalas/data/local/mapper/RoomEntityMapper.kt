package com.example.checklistsalas.data.local.mapper

import com.example.checklistsalas.data.local.entity.RoomEntity
import com.example.checklistsalas.domain.model.Room

fun RoomEntity.toRoom(): Room {
    return Room(
        id = id,
        name = name,
        site = site,
        floor = floor,
        state = state,
        checklistCompleted = checklistCompleted
    )
}

fun Room.toRoomEntity(): RoomEntity {
    return RoomEntity(
        id = id,
        name = name,
        site = site,
        floor = floor,
        state = state,
        checklistCompleted = checklistCompleted

    )
}