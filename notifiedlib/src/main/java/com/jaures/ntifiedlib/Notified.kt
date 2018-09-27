package com.jaures.ntifiedlib

import android.content.Context
import android.content.res.TypedArray
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.support.v4.content.ContextCompat
import android.support.v4.graphics.drawable.DrawableCompat
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView

class Notified : FrameLayout {

    private var m_icon: ImageView? = null
    private var frameLayout: FrameLayout? = null
    private var m_number: TextView? = null
    private var a: TypedArray? = null
    private var m_background: ImageView? = null

    init {
        initialise();
    }

    fun initialise() {

        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view = inflater.inflate(R.layout.notify, this, true)

        m_icon = view.findViewById(R.id.icon)
        m_number = view.findViewById(R.id.number)
        m_background = view.findViewById(R.id.background)

        m_icon!!.setVisibility(View.GONE);
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {

        val a = context.theme.obtainStyledAttributes(
                attrs,
                R.styleable.notified,
                0, 0)

        try {
            // Retrieve Styleable Count
            val number: String?;
            number = a.getString(R.styleable.notified_notified_count);

            if (number != null) {

                // More or equal to value 100
                if (Integer.valueOf(number) >= 100) {
                    m_number!!.text = context.getString(R.string.ninetine_nine_plus);
                } else
                    m_number!!.text = number

            }

            // Retrieve Drawable Styleable Icon
            val myIcon: Drawable?;
            myIcon = a.getDrawable(R.styleable.notified_notified_icon)

            if (myIcon != null) {
                m_icon!!.setVisibility(View.VISIBLE);
                m_icon!!.setImageDrawable(myIcon)
            }


            // Retrieve color
            val color: Int?;
            color = a.getColor(R.styleable.notified_notified_color, Color.RED);

            if (color != null) {
                DrawableCompat.setTint(m_background!!.getDrawable(), ContextCompat.getColor(context, color));
                m_background
            }

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
