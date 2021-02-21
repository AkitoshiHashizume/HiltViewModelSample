package com.akitoshi.hashizume.hiltviewmodelsample.activity

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.akitoshi.hashizume.hiltviewmodelsample.R
import com.akitoshi.hashizume.hiltviewmodelsample.viewmodel.SampleViewModel
import com.akitoshi.hashizume.hiltviewmodelsample.viewmodel.UserViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UserActivity : AppCompatActivity() {

  private val userViewModel: UserViewModel by viewModels()
  private val sampleViewModel: SampleViewModel by viewModels()

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    userViewModel.login()
    sampleViewModel.showId()
  }
}