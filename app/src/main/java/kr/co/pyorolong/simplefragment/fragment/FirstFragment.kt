package kr.co.pyorolong.simplefragment.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import kr.co.pyorolong.simplefragment.R
import kr.co.pyorolong.simplefragment.databinding.FragmentFirstBinding
import kr.co.pyorolong.simplefragment.viewmodel.FirstViewModel

class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding
    private var viewModel: FirstViewModel? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProviders.of(this).get(FirstViewModel::class.java)
        binding = DataBindingUtil.inflate(layoutInflater, R.layout.fragment_first, container, false)
        binding.viewModel = viewModel
        return binding.root
    }

    companion object {
        fun newInstance(): FirstFragment {
            return FirstFragment()
        }
    }

}