fun main() {
    println("Digite sua idade:")
    val idadeInput = readLine()

    if (idadeInput == null) {
        println("Idade Inválida.")
        return
    } 

    val idade = idadeInput.toIntOrNull()

    if (idade == null) {
        println("Idade Inválida. Por favor, insira um número válido.")
        return
    } 

    if (idade >= 18) {
        println("Você é maior de idade.")
    } else {
        println("Você é menor de idade.")
    }
}