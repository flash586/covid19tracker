package com.example.covid19tracker.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.covid19tracker.R

class SlideshowFragment : Fragment() {

    private lateinit var slideshowViewModel: SlideshowViewModel
    private var text1: TextView? = null
    private var text11: String? = null
    private var text2: TextView? = null
    private var text3: TextView? = null
    private var text4: TextView? = null
    private var text5: TextView? = null
    private var text6: TextView? = null
    private var text7: TextView? = null

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        slideshowViewModel =
                ViewModelProviders.of(this).get(SlideshowViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_slideshow, container, false)
        /*val textView: TextView = root.findViewById(R.id.text_slideshow)
        slideshowViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })*/
        text11 = "Стандартні рекомендації ВООЗ для широкої громадськості щодо зменшення впливу та передачі ГРВІ:"
        text1 = root.findViewById(R.id.text_slideshow)
        text1?.setText(text11)
        text2 = root.findViewById(R.id.textView3)
        text2?.setText("  1) часто мийте руки або обробляйте дезінфікуючими засобами;")
        text3 = root.findViewById(R.id.textView4)
        text3?.setText("  2) під час кашлю та чхання прикривайте рот і ніс паперовою хустинкою. Використану хустку варто негайно викинути та помити руки;")
        text4 = root.findViewById(R.id.textView6)
        text4?.setText("  3) уникайте тісного контакту з усіма, хто має гарячку та кашель;")
        text5 = root.findViewById(R.id.textView7)
        text5?.setText("  4) якщо маєте підвищену температуру тіла, кашель й утруднене дихання, якнайшвидше зверніться до лікаря та повідомте йому попередньою історією подорожей;")
        text6 = root.findViewById(R.id.textView8)
        text6?.setText("  5) відвідуючи живі ринки в районах, в яких зараз фіксуються випадки нового коронавірусу, уникайте контакту з живими тваринами та поверхнями, які контактують з тваринами;")
        text7 = root.findViewById(R.id.textView9)
        text7?.setText("  6) не споживайте сирих чи недостатньо термічно оброблених продуктів тваринного походження. Із сирим м'ясом, молоком тощо слід поводитися обережно.")
        return root
    }
}
