package com.example.checklistsalas.di

import android.content.Context
import androidx.room.Room
import com.example.checklistsalas.data.AppDatabase
import com.example.checklistsalas.data.local.dao.RoomDao
import com.example.checklistsalas.data.repository.RoomRepositoryImpl
import com.example.checklistsalas.domain.repository.RoomRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideAppDatabase(
        @ApplicationContext context: Context,
    ): AppDatabase = Room.databaseBuilder(
        context,
        AppDatabase::class.java,
        "checklist_db"
    ).build()

    @Provides
    fun provideRoomDao(
        appDatabase: AppDatabase,
    ): RoomDao = appDatabase.roomDao()

    @Provides
    @Singleton
    fun provideRoomRepository(
        roomDao: RoomDao,
    ): RoomRepository = RoomRepositoryImpl(roomDao)
}