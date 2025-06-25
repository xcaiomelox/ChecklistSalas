package com.example.checklistsalas.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.checklistsalas.domain.model.Room
import com.example.checklistsalas.domain.repository.RoomRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: RoomRepository
) : ViewModel() {

    val rooms: StateFlow<List<Room>> = repository
        .getAllRooms()
        .stateIn(
            viewModelScope,
            SharingStarted.WhileSubscribed(),
            emptyList()
        )

    fun setCompleted(room: Room) {
        viewModelScope.launch {
            repository.updateRoom(room.copy(checklistCompleted = true))
        }
    }
}