package com.akitoshi.hashizume.hiltviewmodelsample.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.akitoshi.hashizume.hiltviewmodelsample.R
import com.akitoshi.hashizume.hiltviewmodelsample.viewmodel.SampleViewModel
import com.akitoshi.hashizume.hiltviewmodelsample.viewmodel.UserViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UserFragment : Fragment(R.layout.fragment_user) {

  private val userViewModel: UserViewModel by viewModels()
  private val sampleViewModel: SampleViewModel by viewModels()

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    userViewModel.login()
    sampleViewModel.showId()
  }
}