fun main() {

    println("PARTE 2 - SISTEMA DE TIPOS")

    // 1. TIPAGEM FORTE

    val numero: Int = 10
    val texto: String = "10"

    println("Número: $numero")
    println("Texto: $texto")

    // Kotlin não permite misturar tipos diferentes diretamente.
    // Isso poderia causar erro: println(numero + texto)

    val textoConvertido: Int = texto.toInt()
    val resultado = numero + textoConvertido

    println("Texto convertido para Int: $textoConvertido")
    println("Resultado da soma: $resultado")


    // 2. TIPAGEM ESTÁTICA

    val idade: Int = 21
    val nome: String = "Carlos"

    println("Idade: $idade")
    println("Nome: $nome")


    // 3. INFERÊNCIA DE TIPOS

    val numeroInferido = 10
    val decimalInferido = 3.14
    val textoInferido = "Kotlin"

    println("Número inferido: $numeroInferido")
    println("Decimal inferido: $decimalInferido")
    println("Texto inferido: $textoInferido")

    println("Tipo do número: ${numeroInferido::class}")
    println("Tipo do decimal: ${decimalInferido::class}")
    println("Tipo do texto: ${textoInferido::class}")


    // 4. VAL

    val numeroFixo = 10

    println("Valor inicial: $numeroFixo")

    // Uma variável declarada com val não pode ser reatribuída.
    // Então se fosse atribuido algo a "numeroFixo" o compilador daria erro


    // 5. VAR

    var numeroAlteravel = 10

    println("Antes: $numeroAlteravel")

    numeroAlteravel = 20

    println("Depois: $numeroAlteravel")


    // 6. LISTA SOMENTE PARA LEITURA

    val lista = listOf(10, 20, 30)

    println("Lista: $lista")
    println("Primeiro elemento: ${lista[0]}")

    // Não é possível adicionar elementos diretamente em uma List.

    // 7. LISTA MUTÁVEL

    val listaMutavel = mutableListOf(10, 20, 30)

    println("Antes: $listaMutavel")

    listaMutavel.add(40)
    listaMutavel.remove(10)

    println("Depois: $listaMutavel")


    // 8. SET SOMENTE PARA LEITURA

    val conjunto = setOf(10, 20, 20, 30, 30)

    println("Set: $conjunto")


    // 9. SET MUTÁVEL

    val conjuntoMutavel = mutableSetOf(10, 20, 30)

    conjuntoMutavel.add(40)
    conjuntoMutavel.remove(10)

    println("MutableSet: $conjuntoMutavel")


    // 10. MAP SOMENTE PARA LEITURA

    val idades = mapOf(
        "João" to 20,
        "Maria" to 22,
        "Carlos" to 19
    )

    println("Map: $idades")
    println("Idade da Maria: ${idades["Maria"]}")


    // 11. MAP MUTÁVEL

    val idadesMutavel = mutableMapOf(
        "João" to 20,
        "Maria" to 22
    )

    idadesMutavel["Carlos"] = 19

    println("MutableMap: $idadesMutavel")
}