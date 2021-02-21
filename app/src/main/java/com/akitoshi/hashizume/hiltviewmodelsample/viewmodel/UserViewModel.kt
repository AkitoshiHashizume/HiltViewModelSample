package com.akitoshi.hashizume.hiltviewmodelsample.viewmodel

import androidx.lifecycle.ViewModel
import com.akitoshi.hashizume.hiltviewmodelsample.user.UserManager
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class UserViewModel @Inject constructor(
    private val userManager: UserManager
) : ViewModel() {

  fun login() {
    userManager.login()
  }
}