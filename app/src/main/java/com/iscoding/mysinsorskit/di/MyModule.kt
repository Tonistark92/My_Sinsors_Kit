package com.iscoding.mysinsorskit.di

import android.app.Application
import com.iscoding.mysinsorskit.sinsorskit.BaseSinsor
import com.iscoding.mysinsorskit.sinsorskit.LightSensor
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object SensorModule {

    @Provides
    @Singleton
    fun provideLightSensor(app: Application): BaseSinsor {
        return LightSensor(app)
    }
}