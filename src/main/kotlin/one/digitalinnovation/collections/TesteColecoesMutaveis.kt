package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("Joao", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }

    println ("---------DIVISAO---------")

    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println ("---------DIVISAO---------")

    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println ("-------DIVISAO-SET-------")

    val funcionariosSet = mutableSetOf(joao)
    funcionariosSet.forEach { println(it) }

    println ("---------DIVISAO---------")

    funcionariosSet.add(pedro)
    funcionariosSet.add(maria)
    funcionariosSet.forEach { println(it) }

    println ("---------DIVISAO---------")

    funcionariosSet.remove(maria)
    funcionariosSet.forEach { println(it) }

}