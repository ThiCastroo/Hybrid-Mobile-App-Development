fun main() {
    println("Digite um número:")
    val numero = readLine()!!.toDouble()

    if (numero > 0) {
        println("O número é positivo.")
    } else if (numero < 0) {
        println("O número é negativo.")
    } else {
        println("O número é zero.")
    }
}