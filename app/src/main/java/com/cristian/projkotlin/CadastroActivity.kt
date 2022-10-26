package com.cristian.projkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        var txtSaida = findViewById(R.id.txtSaida) as TextView

        var resultado = intent.getSerializableExtra("r").toString()

        txtSaida.text = resultado

    }
}