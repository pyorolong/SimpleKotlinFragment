package kr.co.pyorolong.simplefragment.viewmodel

import android.app.Application
import android.content.Context
import android.widget.RadioGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import kotlinx.android.synthetic.main.activity_main.view.*
import kr.co.pyorolong.simplefragment.R
import kr.co.pyorolong.simplefragment.fragment.FirstFragment
import kr.co.pyorolong.simplefragment.fragment.SecondFragment

class MainViewModel(application: Application) : AndroidViewModel(application) {

    val nowFragment = MutableLiveData<Fragment>()
    val context: Context = application.baseContext
    val checkedChangeListener = RadioGroup.OnCheckedChangeListener { _: RadioGroup, i: Int ->
        nowFragment.value = convertResToFragment(i)
    }

    private fun convertResToFragment(res: Int): Fragment {
        return when (res) {
            R.id.radio_first -> FirstFragment.newInstance()
            else -> SecondFragment.newInstance()
        }
    }

    init {
        nowFragment.value = FirstFragment.newInstance()
    }
}