
class Seguranca(val pais: String){
    
    fun compartilharTela(): Unit{

    if(pais == "Brasil"){
       println("O país" +" " + pais + "Não pode compartilhar tela" )
    }else{
        println("O país" + " " + pais +" Pode Compartilhar Tela" )
    }
}
}