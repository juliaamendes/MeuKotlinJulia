fun main(){
    println("hello kotlin")

    /*VARIAVEIS*/

    val nome = "Julia"
    var idade = 18


    /*Tipos de dados*/
    /*
    INT = valores inteiros
    Double= numeros decimais
    Strings = texto
    Boolean = true ou false
     */


    println("meu nome é " + nome + " tenho " + idade + " anos, esse é o meu primeiro kotlin")
    /*Estrutura de controle de dados*/
    val nota = 8
    if (nota >= 7) {
        println("Aprovado")
    }
    else {
        println("Reprovado")

    }
    val dia= 4
    when(dia){
        1 -> println("Domingo")
        2 -> println("Segunda")
        3 -> println("Terça")
        4 -> println("Quarta")
        5 -> println("Quinta")
        6 -> println("Sexta")
        7 -> println("Sabado")
        else -> println("Nenhuma das Opçao")
    }
}
