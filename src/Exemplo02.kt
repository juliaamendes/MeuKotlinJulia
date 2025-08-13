fun main(){
    val nota = 6
    val mensagem = when(nota){
        in 7..10 -> "Aprovado"
        in 5..6-> "Recuperação"
        else -> "Reprovado"


    }
    println(mensagem)
}