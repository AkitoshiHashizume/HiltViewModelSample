package com.akitoshi.hashizume.hiltviewmodelsample.modules

import com.akitoshi.hashizume.hiltviewmodelsample.user.UserManager
import com.akitoshi.hashizume.hiltviewmodelsample.user.UserManagerImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface UserModule {
  @Binds
  fun provideUserManager(impl: UserManagerImpl): UserManager
}