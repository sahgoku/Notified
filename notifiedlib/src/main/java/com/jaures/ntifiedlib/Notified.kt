package com.jaures.ntifiedlib

import android.content.Context
import android.content.res.TypedArray
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView

class Notified : FrameLayout {

    private var m_icon: ImageView? = null
    private var frameLayout: FrameLayout? = null
    private var m_number: TextView? = null
    private var a: TypedArray? = null

    init {
        initialise();
    }

    fun initialise() {

        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view = inflater.inflate(R.layout.notify, this, true)

        m_icon = view.findViewById(R.id.icon)
        m_number = view.findViewById(R.id.number)
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {

        val a = context.theme.obtainStyledAttributes(
                attrs,
                R.styleable.notified,
                0, 0)

        try {
            // Count
            val myString: String?;
            myString = a.getString(R.styleable.notified_notified_count);

            if (myString != null)
                m_number!!.text = myString

            //m_icon
            val myIcon: Drawable?;
            myIcon = a.getDrawable(R.styleable.notified_notified_icon)
            if (myIcon != null)
                m_icon!!.setImageDrawable(myIcon)

        } finally {
            a.recycle()
        }
    }

    fun setNumber(number: Int) {
        m_number!!.text = number.toString()
    }

    fun setIcon(icon: Drawable) {
        m_icon!!.setImageDrawable(icon)
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}
}
