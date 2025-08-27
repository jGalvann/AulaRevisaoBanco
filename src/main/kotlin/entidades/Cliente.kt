package org.example.entidades

import org.example.enumeradores.Sexo

class Cliente(
    nome: String,
    sobrenome: String,
    cpf: Long,
    sexo: Sexo,
    val cadastrado: Boolean,
    val endereco: String,
    val servicoContratado: String,

    ) : Pessoa(nome = nome, sobrenome = sobrenome, cpf = cpf, sexo = sexo)
{

}