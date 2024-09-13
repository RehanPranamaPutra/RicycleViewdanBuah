package com.rehan.apprehan

import android.content.Intent
import android.os.Bundle
import android.provider.Telephony.Mms.Intents
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.rehan.apprehan.Model.ModelBuah

class MainActivity : AppCompatActivity() {

    private lateinit var btnRecycleView : Button
    private lateinit var btnRecycleBuah : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnRecycleView =findViewById(R.id.btnRecycleView)
        btnRecycleBuah =findViewById(R.id.btnRecycleBuah)



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnRecycleView.setOnClickListener(){
            val intentMenu = Intent(this@MainActivity,RecycleView::class.java)
            startActivity(intentMenu)
        }

        btnRecycleBuah.setOnClickListener(){
            val intentMenu = Intent(this@MainActivity,RecycleBuah::class.java)
            startActivity(intentMenu)
        }
    }
}