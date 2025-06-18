package com.example.checklistsalas.di

import androidx.room.Room
import com.example.checklistsalas.data.AppDatabase
import com.example.checklistsalas.data.local.dao.SalaDao
import com.example.checklistsalas.data.repository.SalaRepositoryImpl
import com.example.checklistsalas.domain.repository.SalaRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideAppDatabase(app: android.app.Application): AppDatabase {
        return Room.databaseBuilder(
            app,
            AppDatabase::class.java,
            "checklist_sala_db"
        ).build()
    }

    @Provides
    fun provideSalaDao(appDatabase:
    AppDatabase): SalaDao {
        return appDatabase.salaDao()
    }

    @Provides
    @Singleton
    fun provideSalaRepository(salaDao: SalaDao): SalaRepository {
        return SalaRepositoryImpl(salaDao)
    }
}