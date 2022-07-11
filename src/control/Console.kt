package control

class Console private constructor() {
    companion object{
        fun readInt(msg: String): Int {
            var result: Int? = null
            do{
                print(msg)
                val info = readLine()

                if (info != null && info != "") {
                    result = info.toIntOrNull()

                    if (result == null || result <= 0){
                        println("Valor inválido.")
                    }
                } else {
                    println("Valor inválido.")
                }

            }while(result == null || result <= 0)

            return result
        }

        fun readString(msg: String): String{
            var result: String? = null
            do {
                print(msg)
                val info = readLine()

                if (info != null && info != "") {
                    result = info.lowercase()
                } else {
                    println("Valor inválido")
                }

            } while(result == null)
            return result

        }
    }

}