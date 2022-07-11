package business

import entity.Ticket

class TorcedorBusiness {
    fun validarTipo(tipo: String) = (tipo == "geral" || tipo == "cadeiras" || tipo == "camarote")

    fun maiorDeIdade(idade: Int) = idade > 18

    fun validarTorcedor(ticket: Ticket) = when (ticket.tipo) {
        "geral" -> ticket.codigo.startsWith("gr")
        "cadeiras", "camarote" -> ticket.codigo.startsWith("sc")
        else -> false
    }
}
