package control

import business.TorcedorBusiness
import entity.Ticket

class Ingresso {

    private val torcedorBusiness = TorcedorBusiness()

    init {
        println("Bilheteria iniciada")
        println(controle())
    }

    fun controle(): String{
        val idade = Console.readInt("Qual a sua idade? ")
        val ticket = Ticket(idade = idade)

        if (!torcedorBusiness.maiorDeIdade(ticket.idade)){
            return "Menores de Idade só entram com responsável mediante o mesmo."
        }

        ticket.tipo = Console.readString("Qual é o tipo do ingresso? ")
        if (!torcedorBusiness.validarTipo(ticket.tipo)){
            return "Negado, o tipo do ingresso não é válido."
        }

        ticket.codigo = Console.readString("Qual é o código do ingresso? ")
        if (!torcedorBusiness.validarTorcedor(ticket)){
            return "Negado, o tipo do ingresso não é válido."
        }

        return "Bem-vindo(a), Bom Jogo!! :)"
    }
}