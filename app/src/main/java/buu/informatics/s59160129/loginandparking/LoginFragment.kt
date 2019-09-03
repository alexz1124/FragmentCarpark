package buu.informatics.s59160129.loginandparking


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import buu.informatics.s59160129.loginandparking.databinding.FragmentLoginBinding

/**
 * A simple [Fragment] subclass.
 */
class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentLoginBinding>(
            inflater,R.layout.fragment_login,container,false
        )

        binding.btnLogin.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_loginFragment_to_carparkFragment)
        }
        return binding.root
    }
}