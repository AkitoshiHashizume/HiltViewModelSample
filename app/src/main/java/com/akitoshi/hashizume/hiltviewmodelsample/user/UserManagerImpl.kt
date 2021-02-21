package com.akitoshi.hashizume.hiltviewmodelsample.user

import javax.inject.Inject

class UserManagerImpl @Inject constructor() : UserManager {
  override fun login() {
    println("login")
  }
}
