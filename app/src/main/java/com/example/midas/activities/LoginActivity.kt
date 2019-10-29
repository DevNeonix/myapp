package com.example.midas.activities

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.sax.StartElementListener
import android.widget.TextView
import com.example.midas.R
import com.example.midas.utils.setTimeOut
import com.rilixtech.materialfancybutton.MaterialFancyButton
import pyxis.uzuki.live.richutilskt.utils.alert
import pyxis.uzuki.live.richutilskt.utils.browse
import pyxis.uzuki.live.richutilskt.utils.progress
import pyxis.uzuki.live.richutilskt.utils.toast

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var tvwellcome: TextView = findViewById(R.id.tv_wellcome_back)
        var font = Typeface.createFromAsset(assets, "fonts/ubuntuRegular.ttf")
        tvwellcome.setTypeface(font)
        var button = findViewById<MaterialFancyButton>(R.id.btn_submit);
        button.setOnClickListener {
            var dialog = progress("Espere un momento por favor.", false);

            var intent = Intent(applicationContext, MainActivity::class.java)
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
            setTimeOut({
                dialog.dismiss()
                startActivity(intent)
            }, 1500)
        }

    }
}
