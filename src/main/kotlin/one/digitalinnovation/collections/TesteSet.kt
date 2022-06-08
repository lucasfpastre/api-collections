package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("Joao", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach { println(it) }

    println ("---------DIVISAO---------")

    val funcionarios3 = setOf(joao, pedro, maria)
    val resultOfSubtract = funcionarios3.subtract((funcionarios2))
    resultOfSubtract.forEach { println(it) }

    println ("---------DIVISAO---------")
    val resultOfIntersect = funcionarios3.intersect(funcionarios2)
    resultOfIntersect.forEach { println(it) }
}