package com.example.navigationtoolbarsample


import android.os.Bundle
import android.view.*
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        view.findViewById<Button>(R.id.button).setOnClickListener {
            findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
        }

        setHasOptionsMenu(true)

        return view
    }

    // 他のメニュー出したい時
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu_main, menu)

        val item = menu.findItem(R.id.to_third)
        item.setOnMenuItemClickListener {
            findNavController().navigate(R.id.action_firstFragment_to_thirdFragment)
            true
        }
    }
}
