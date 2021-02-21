package com.akitoshi.hashizume.hiltviewmodelsample.viewmodel

import androidx.lifecycle.ViewModel

class SampleViewModel(
    private val sampleId: String
) : ViewModel() {

  fun showId() {
    println(sampleId)
  }
}