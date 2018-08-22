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

        /*// Icon
        m_icon = ImageView(getContext())
        m_icon!!.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.ic_notifications_black_24dp))
        m_icon!!.maxWidth = 30
        m_icon!!.maxHeight = 30
        val lp = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT)
        lp.setMargins(10, 10, 10, 10)
        m_icon!!.layoutParams = lp

        // Notif
        frameLayout = FrameLayout(getContext())
        val lp_ = FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT, Gravity.RIGHT or Gravity.TOP)
        lp_.setMargins(9, 9, 9, 9)
        frameLayout!!.layoutParams = lp
        frameLayout!!.setBackgroundDrawable(ContextCompat.getDrawable(getContext(), R.drawable.ic_count))
        // Notif Text
        text = TextView(getContext())
        text!!.maxWidth = 18
        text!!.maxHeight = 18
        text!!.ellipsize = TextUtils.TruncateAt.MARQUEE
        val fArray = arrayOfNulls<InputFilter>(1)
        fArray[0] = InputFilter.LengthFilter(4)
        text!!.filters = fArray
        text!!.setSingleLine()
        text!!.text = "877998"
        text!!.setTextColor(Color.WHITE)
        text!!.textSize = 10f
        frameLayout!!.addView(text)

        this.addView(m_icon)
        this.addView(frameLayout)*/
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {

        val a = context.theme.obtainStyledAttributes(
                attrs,
                R.styleable.notified,
                0, 0)

        try {
            // Count
            val myString = a.getString(R.styleable.notified_notified_count)
            m_number!!.text = myString

            //m_icon
            val myIcon: Drawable = a.getDrawable(R.styleable.notified_notified_icon)
            m_icon!!.setImageDrawable(myIcon)

        } finally {
            a.recycle()
        }

//        m_icon!!.width = width
//        m_icon!!.maxWidth = width

    }

    fun setNumber(number: Int) {
        m_number!!.text = number.toString()
    }

    fun setIcon(icon: Drawable) {
        m_icon!!.setImageDrawable(icon)
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}
}
