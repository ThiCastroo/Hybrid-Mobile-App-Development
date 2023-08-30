fun main() {
    println("Digite seu nome de usuario:")
    val usuarioInput = readLine()
    println("Digite sua senha:")
    val senhaInput = readLine()

    val usuario = "alice" 
    val senha = "senha123"

    if (usuarioInput == usuario && senhaInput == senha) {
        println("Acesso permitido.")
    } else {
        println("Acesso negado.")
    }
}