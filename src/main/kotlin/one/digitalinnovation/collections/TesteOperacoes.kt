package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)
    val divisor = "---------------------------"
    for (salario in salarios) {
        println(salario)
    }

    println(divisor)

    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Salario medio: ${salarios.average()}")

    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }
    println(divisor)
    salariosMaiorQue2500.forEach { println(it) }

    println(divisor)
    println(salarios.count{it in 2000.0 .. 5000.0})

    println(divisor)
    println(salarios.find { it == 2250.0 })
    println(divisor)
    println(salarios.find { it == 500.0 })
    println(divisor)
    println(salarios.any { it == 1000.0 })
    println(divisor)
    println(salarios.any { it == 500.0 })
}