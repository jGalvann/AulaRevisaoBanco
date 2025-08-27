package org.example.entidades

import java.math.BigDecimal

class Conta (
    val titular : Pessoa,
    val numeroConta : Long,
    // val agencia : Int,
    // val senha : String,
    var saldo : BigDecimal,
)