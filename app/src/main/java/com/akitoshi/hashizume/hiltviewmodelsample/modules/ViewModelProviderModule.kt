package com.akitoshi.hashizume.hiltviewmodelsample.modules

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.akitoshi.hashizume.hiltviewmodelsample.viewmodel.SampleViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.internal.lifecycle.DefaultActivityViewModelFactory
import dagger.hilt.android.internal.lifecycle.DefaultFragmentViewModelFactory
import dagger.multibindings.IntoSet

@Module
@InstallIn(ActivityComponent::class)
object ViewModelProviderModule {

  @Provides
  @IntoSet
  @DefaultActivityViewModelFactory
  @Suppress("UNCHECKED_CAST")
  fun provideDefaultActivityViewModelFactory(): ViewModelProvider.Factory {
    return object : ViewModelProvider.Factory {
      override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        // ここでViewModel生成のカスタマイズを行う。
        if (modelClass == SampleViewModel::class.java) return SampleViewModel("1") as T
        return modelClass.newInstance() as T
      }
    }
  }

  @Provides
  @IntoSet
  @DefaultFragmentViewModelFactory
  @Suppress("UNCHECKED_CAST")
  fun provideDefaultFragmentViewModelFactory(): ViewModelProvider.Factory {
    return object : ViewModelProvider.Factory {
      override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        // ここでViewModel生成のカスタマイズを行う。
        if (modelClass == SampleViewModel::class.java) return SampleViewModel("1") as T
        return modelClass.newInstance() as T
      }
    }
  }
}