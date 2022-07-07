class Ingresso {

    fun controle(){
        val idade = Console.readInt("Qual a sua idade? ")
        if (idade < 18){
            println("Menores de Idade só entram com responsável mediante o mesmo.")
            return
        }

        val tipoIngresso = Console.readString("Qual é o tipo do ingresso? ")
        println(tipoIngresso)
    }
}

fun stadiumTicket() {
    /*print("Qual sua idade? ")
    val idade = readLine()
    if (idade != null && idade != "") {
        if (idade.toInt() < 18) {
            println("Menores de Idade só entram com responsável mediante o mesmo.")
            return
        }
    }*/
    print("Qual é o tipo do ingresso? ")
    var tipoIngresso = readLine()
    if (tipoIngresso != null && tipoIngresso != "") {
        tipoIngresso = tipoIngresso.lowercase()
        // Validação do tipo de Ingresso
        if (tipoIngresso != "geral" && tipoIngresso != "cadeiras" && tipoIngresso != "camarote") {
            println("Negado, o tipo do ingresso não é válido.")
            return
        }
        print("Qual o código do Ingresso? ")
        var ingresso = readLine()
        if (ingresso != null && ingresso != "") {
            ingresso = ingresso.lowercase()
            if (tipoIngresso == "geral" && ingresso.startsWith("gr")) {
                println("Seja bem-vindo(a), torcedor. Bom Jogo!! :)")
            } else if ((tipoIngresso == "cadeiras" || tipoIngresso == "camarote") && ingresso.startsWith("sc")
            ) {
                println("Seja bem-vindo(a), sócio torcedor. Bom Jogo!! :)")
            } else {
                println("Negado, o tipo do ingresso não é válido.")
            }
        }
    }
}