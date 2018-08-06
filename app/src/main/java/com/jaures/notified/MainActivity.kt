package com.jaures.notified

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        notified.setNumber(78)
//        notified.setIcon(ContextCompat.getDrawable(this, R.drawable.abc_ab_share_pack_mtrl_alpha))
        notified.setIcon(getDrawable(R.drawable.ic_email_black_24dp))
    }
}
