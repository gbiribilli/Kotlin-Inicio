fun main() {
    val pais = Seguranca("Australia")
    val pais2 = Seguranca("Brasil")
    pais.compartilharTela()
    pais2.compartilharTela()


    val vetor = intArrayOf(2,7,11,15) //Array de Inteiros
    val valorEsperado = 9 //variavel do tipo int
    var numerosResultantes = somaDois(vetor,valorEsperado)
    println(numerosResultantes.joinToString());
}

//Esta função tem por objetivo servir de exemplo para aplicação de lógica de programação utilizando Kotlin
fun somaDois(nums: IntArray, target: Int): IntArray { //Recebe um array de inteiros, um numero inteiro, e retorna um array de inteiros
    var vector = intArrayOf(0,0)

        for(i in nums.indices){

        if(nums[i] + nums[i+1] == target){
            println("Encontrado")
            vector = intArrayOf(i,i+1)
            return vector
        }
        
        }
    println("Não encontrado")
    return vector
}


