package com.example.checklistsalas.data.repository

import com.example.checklistsalas.data.local.dao.RoomDao
import com.example.checklistsalas.data.local.mapper.toRoom
import com.example.checklistsalas.data.local.mapper.toRoomEntity
import com.example.checklistsalas.domain.model.Room
import com.example.checklistsalas.domain.repository.RoomRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class RoomRepositoryImpl @Inject
constructor(
    private val roomDao: RoomDao
) : RoomRepository {

    override fun getAllRooms(): Flow<List<Room>> {
        return roomDao.getRooms().map { entityList ->
            entityList.map {
                it.toRoom()
            }
        }
    }

    override suspend fun updateRoom(room: Room) {
        roomDao.updateRoom(room.toRoomEntity())
    }
}