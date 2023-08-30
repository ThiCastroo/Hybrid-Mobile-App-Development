fun main() {
    println("Digite um dia:")
    val diaSemana = readLine()!!.toInt()
    val mensagem = when (diaSemana) {
        1 -> "Domingo"
        2 -> "Segunda"
        3 -> "Terça"
        4 -> "Quarta" 
        5 -> "Quinta"
        6 -> "Sexta"
        7 -> "Sabado"
        else -> "Dia inválido"
    }
    println("Hoje é $mensagem.")
}