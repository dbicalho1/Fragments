package edu.temple.fragments

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class ColorFragment : Fragment() {
    private val colors = arrayOf("Red", "Yellow", "Blue", "Magenta", "Teal")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_color, container, false).apply {
            setOnClickListener {
                setBackgroundColor(Color.parseColor(colors.random()))
            }
        }
    }
}
