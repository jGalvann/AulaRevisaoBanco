package org.example.entidades

import java.math.BigDecimal
import org.example.enumeradores.Sexo

open class Pessoa(
    val nome: String,
    val sobrenome: String,
    val cpf: Long,
    val sexo: Sexo

) {
    // comportamento
    // tem que ter o open para o kotlin definir como "a partir de agora tu podes ser herdado"
    open fun receberConta(conta : Conta, denero : BigDecimal){
        conta.saldo = conta.saldo.add(denero)
    }


}