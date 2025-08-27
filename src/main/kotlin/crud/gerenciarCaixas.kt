package org.example.crud

import org.example.entidades.CaixaDAgua
import org.example.enumeradores.Material

fun cadastrarCaixa(){
    /*


    val marca: String,


     */
    println("Digite o material qual compõe a caixa")
    println("1 - Plástico")
    println("2 - Fibra de Vidro")
    println("3 - Polietileno")
    println("4 - Concreto")
    var opcao = readLine()?.toInt()
    var material : Material
    when (opcao) {
        1 -> material = Material.PLASTICO
        2 -> material = Material.FIBRA_DE_VIDRO
        3 -> material = Material.POLIETILENO
        4 -> material = Material.CONCRETO
        else -> material = Material.PLASTICO
    }

    println("Qual a capacidade da caixa? EM LITROS")
    var capacidade = readln().toInt()

    println("Qual a cor da sua caixa ?")
    var cor = readln()

    println("Qual o peso da Caixa?")
    val peso = readln().toDouble()

    println("É interna?")
    println("1 - sim | 2 - não")
    var interna : Boolean
     opcao = readln().toInt()
    when (opcao) {
        1 -> interna = true
        2 -> interna = false
    }

    println("Qual a marca da caixa?")
    val marca = readln()

    CaixaDAgua(
        material = material,
        capacidade = capacidade,
        cor = cor,
        peso = peso,
        marca = marca,
    )
}

fun editarCaixa(){

}

fun listarCaixas(){

}


fun excluirCaixa(){

}