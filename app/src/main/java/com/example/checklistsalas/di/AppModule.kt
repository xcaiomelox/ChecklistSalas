package com.example.checklistsalas.di

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
    fun provideSalaRepository(): SalaRepository {
        return SalaRepositoryImpl()
    }
}