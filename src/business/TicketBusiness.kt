package business

class TicketBusiness {
    fun validarTipo(tipo: String) = (tipo == "geral" || tipo == "cadeiras" || tipo == "camarote")

    fun validarCodigo(codigo: String, tipo: String): Boolean{
        if (tipo == "geral" && codigo.startsWith("gr")) {
            return true
        } else if ((tipo == "cadeiras" || tipo == "camarote") && codigo.startsWith("sc")) {
            return true
        } else {
            return false
        }
    }
}