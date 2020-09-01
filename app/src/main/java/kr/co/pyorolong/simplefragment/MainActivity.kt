package kr.co.pyorolong.simplefragment

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import kr.co.pyorolong.simplefragment.databinding.ActivityMainBinding
import kr.co.pyorolong.simplefragment.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private val fragmentManager = supportFragmentManager
    private lateinit var context: Context
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        context = applicationContext
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel
        initFragment()
        observeCheckedPosition()

    }

    private fun initFragment() {
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(binding.frameContainer.id, viewModel.nowFragment.value!!)
        fragmentTransaction.commit()
    }

    private fun observeCheckedPosition() {
        viewModel.nowFragment.observe(this, Observer { fragmentManager -> initFragment() })
    }

}