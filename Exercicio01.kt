fun main () {
  val nota = 90
  val mensagem=when(nota){
    in 9..10->"Otimo"
    in 7..8,9->"Bom"
    in 5..6,9->"Regular"
    in 0..4,9->"Podre"
    println(mensagem)
    
  }
  
