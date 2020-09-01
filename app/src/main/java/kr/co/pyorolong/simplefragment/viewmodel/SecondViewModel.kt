package kr.co.pyorolong.simplefragment.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel

class SecondViewModel(application: Application) : AndroidViewModel(application) {
    val context = application.baseContext
}