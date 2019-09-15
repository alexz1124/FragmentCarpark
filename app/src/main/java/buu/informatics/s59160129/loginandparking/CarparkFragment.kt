package buu.informatics.s59160129.loginandparking


import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import buu.informatics.s59160129.loginandparking.databinding.ActivityMainBinding
import buu.informatics.s59160129.loginandparking.databinding.FragmentCarparkBinding
import kotlinx.android.synthetic.main.fragment_carpark.*

/**
 * A simple [Fragment] subclass.
 */
class CarparkFragment : Fragment() {
    private lateinit var binding: FragmentCarparkBinding
    private var slot1: MyCar = MyCar("", "", "")
    private var slot2: MyCar = MyCar("", "", "")
    private var slot3: MyCar = MyCar("", "", "")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate<FragmentCarparkBinding>(
            inflater,
            R.layout.fragment_carpark, container, false
        )
        binding.apply {
            statusOne.setOnClickListener { slotOne() }
            statusTwo.setOnClickListener { slotTwo() }
            statusThree.setOnClickListener { slotThree() }
        }
        updateUI(slot1)
        return binding.root
    }




    private fun slotOne() {
        binding.apply {
            btnDel.setOnClickListener { deleteSlot(slot1,status_one) }
            btnEdit.setOnClickListener { updateSlot(slot1,status_one) }
            updateUI(slot1)
        }
    }
    private fun slotTwo() {
        binding.apply {
            btnDel.setOnClickListener { deleteSlot(slot2,status_two) }
            btnEdit.setOnClickListener { updateSlot(slot2,status_two) }
            updateUI(slot2)
        }
    }

    private fun slotThree() {
        binding.apply {
            btnDel.setOnClickListener { deleteSlot(slot3,status_three) }
            btnEdit.setOnClickListener { updateSlot(slot3,status_three) }
            updateUI(slot3)
        }
    }

   ////////////////////////////////////////////////////////////////////
    private fun deleteSlot(slot: MyCar,box : TextView) {
        slot.plate = ""
        slot.brand = ""
        slot.name = ""
        box.setText("available")
        box.setBackgroundColor(Color.GREEN)
        updateUI(slot)
    }

    private fun updateSlot(slot: MyCar,box: TextView) {
        binding.apply {
            slot.plate = text1.text.toString()
            slot.brand = text2.text.toString()
            slot.name = text3.text.toString()
            box.setText("busy")
            box.setBackgroundColor(Color.RED)
            updateUI(slot)
        }
    }
    private fun updateUI(slot: MyCar) {
        binding.apply {
            text1.setText(slot.plate)
            text2.setText(slot.brand)
            text3.setText(slot.name)
            invalidateAll()
        }
    }
}
