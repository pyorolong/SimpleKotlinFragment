package kr.co.pyorolong.simplefragment.common

import android.view.View
import android.widget.TextView
import androidx.databinding.BindingAdapter

class DataBindingAdapter {
    companion object {
        @BindingAdapter("onLongClick")
        @JvmStatic
        fun setOnLongclickListener(view: TextView, listener: View.OnLongClickListener) {
            view.setOnLongClickListener(listener)
        }
    }
}