package kr.co.pyorolong.simplefragment.viewmodel

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel

class FirstViewModel(application: Application) : AndroidViewModel(application) {
    val context: Context = application
}