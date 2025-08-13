fun main(){
    val pedido = "X-bacon"
    when(pedido){
        "X-bacon"-> println("Preço: 18,00")
        "X-tudo"-> println("Preço: 26,00")
        "X-salada"-> println("Preço: 17,50")
        else -> println("item não encontrado no cardápio")

    }
}