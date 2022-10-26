package com.cristian.projkotlin

data class Funcionario(
    var nome: String? = null,
    var cpf: Long = 0,
    var chapa: Int = 0,
    var idade: Byte = 0,
    var valorHora: Float = 0.0f,
    var cargaHorariaMes: Double = 0.0
)