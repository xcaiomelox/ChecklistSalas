package com.example.checklistsalas.domain.repository
import kotlinx.coroutines.flow.Flow
import com.example.checklistsalas.domain.model.Room

interface RoomRepository {
    fun getAllRooms(): Flow<List<Room>>
    suspend fun updateRoom(room: Room)
}