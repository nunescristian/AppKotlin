package com.cristian.projkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var edtNome = findViewById(R.id.edtNome) as EditText
        var edtCpf = findViewById(R.id.edtCpf) as EditText
        var edtChapa = findViewById(R.id.edtChapa) as EditText
        var edtIdade = findViewById(R.id.edtIdade) as EditText
        var edtValorHora = findViewById(R.id.edtValorHora) as EditText
        var edtCargaHoraria = findViewById(R.id.edtCargaHoraria) as EditText
        var btnCadastrar = findViewById(R.id.btnCadastrar) as Button

        btnCadastrar.setOnClickListener {

            var objFuncionario = Funcionario(
                edtNome.text.toString(),
                edtCpf.text.toString().toLong(),
                edtChapa.text.toString().toInt(),
                edtIdade.text.toString().toByte(),
                edtValorHora.text.toString().toFloat(),
                edtCargaHoraria.text.toString().toDouble()
            );

            var resultado = objFuncionario.toString()

            var i = Intent(this,CadastroActivity::class.java)

            i.putExtra("r",resultado)

            startActivity(i)

        }


    }
}