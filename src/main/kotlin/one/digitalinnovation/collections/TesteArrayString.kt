package one.digitalinnovation.collections

fun main() {
    val nomes = Array(3) {""}
    nomes[0] = "Maria"
    nomes[1] = "Zaza"
    nomes[2] = "Jose"

    for (nome in nomes) {
        println(nome)
    }
    nomes.sort()
    println("--------------")
    nomes.forEach { println(it) }

    val nomes2 = arrayOf("Maria","Zaza","Pedro")
    nomes2.sort()
    println("--------------")
    nomes2.forEach { println(it) }
}