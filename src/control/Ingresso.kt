package control

import business.TicketBusiness

class Ingresso {

    private val ticketBusiness = TicketBusiness()

    init {
        println("Bilheteria iniciada")
        println(controle())
    }

    fun controle(): String{
        val idade = Console.readInt("Qual a sua idade? ")
        if (idade < 18){
            return "Menores de Idade só entram com responsável mediante o mesmo."
        }

        val tipoIngresso = Console.readString("Qual é o tipo do ingresso? ")
        if (!ticketBusiness.validarTipo(tipoIngresso)){
            return "Negado, o tipo do ingresso não é válido."
        }

        val codigo = Console.readString("Qual é o código do ingresso? ")
        if (!ticketBusiness.validarCodigo(codigo, tipoIngresso)){
            return "Negado, o tipo do ingresso não é válido."
        }

        return "TODO!"
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
        /*tipoIngresso = tipoIngresso.lowercase()
        // Validação do tipo de control.Ingresso
        if (tipoIngresso != "geral" && tipoIngresso != "cadeiras" && tipoIngresso != "camarote") {
            println("Negado, o tipo do ingresso não é válido.")
            return
        }*/
        print("Qual o código do control.Ingresso? ")
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