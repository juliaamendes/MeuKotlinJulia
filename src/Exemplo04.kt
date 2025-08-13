fun main () {
    var opcao: Int? = null //está esperando um valor do tipo inteiro
    while (opcao != 0) {
        println("CARDAPIO: ")
        println("1 - X-Bacon")
        println("2 - X-Tudo")
        println("3 - X-Tudo duplo")
        println("4 - X-Salada")
        println("0 - sair do menu")
        println("Escolha uma opção desejada: ")

        opcao = readLine()?.toIntOrNull()

        when (opcao) {
            1 -> println("Voce escolheu X-Bacon. Preço R$20,00")
            2 -> println("Voce escolheu X-Tudo. Preço R$22,00")
            3 -> println("Voce escolheu X-Tudo Duplo. Preço R$24,00")
            4 -> println("Voce escolheu X-Salada. Preço R$27,50")
            0 -> println("Saindo do Menu. Volte Sempre...")
            else -> println("Opção invalida")
        }
    }
}