fun main() {
    val nota1 = 8.5
    val nota2:Double = 7.0
    val nota3 = 10.0f
    val result = String.format("%.2f", (nota1 + nota2 + nota3) / 3)
    println("Resultado da sua média é: $result")
}