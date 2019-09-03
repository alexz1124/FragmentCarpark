package buu.informatics.s59160129.loginandparking


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import buu.informatics.s59160129.loginandparking.databinding.FragmentCarparkBinding

/**
 * A simple [Fragment] subclass.
 */
class CarparkFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentCarparkBinding>(
            inflater,
            R.layout.fragment_login, container, false
        )
        return binding.root
    }


}
