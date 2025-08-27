package org.example.entidades

import org.example.enumeradores.Setor
import org.example.enumeradores.Sexo
import java.math.BigDecimal

class Funcionario(
    nome: String,
    sobrenome: String,
    cpf: Long,
    sexo: Sexo,
    val setor: Setor

): Pessoa(
    nome = nome,
    sobrenome = sobrenome,
    cpf = cpf,
    sexo = sexo
){

    //Comportamento do Profissional
    fun instalarCaixaDAgua(clt : Funcionario){
        if(clt.setor.equals(Setor.MONTAGEM)){
            println("Profissional habilitado")
        }else{
            println("Profissional desqualificado")
        }

    }

    override fun receberConta(conta : Conta, denero : BigDecimal){
        conta.saldo = conta.saldo.subtract(denero)
    }

}
// o polimorfismo nada masi é do que sobrescrever o
// métod que está na suporclasse
