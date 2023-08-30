fun main() {
    println("Digite sua nota (0-100):")
    val nota = readLine()!!.toDouble()
    if (nota >= 60) {
        if (nota >= 90) {
            println("Parabéns, você tirou uma ótima nota!")
        } else {
            println("Você passou no teste.")
        }
    } else {
        println("Você não passou no teste.")
    }
}