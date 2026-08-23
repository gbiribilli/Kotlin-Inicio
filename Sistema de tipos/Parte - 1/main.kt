fun main() {
    
    println("PARTE 1 - TIPOS PRIMITIVOS")

    // 1. NÚMEROS

    val byte: Byte = 100
    val short: Short = 30000
    val int: Int = 100000
    val long: Long = 10000000000L

    val float: Float = 3.14f
    val double: Double = 3.1415926535

    println("Byte: $byte")
    println("Short: $short")
    println("Int: $int")
    println("Long: $long")
    println("Float: $float")
    println("Double: $double")

    // 2. TIPOS UNSIGNED

    val uByte: UByte = 200u
    val uShort: UShort = 60000u
    val uInt: UInt = 4000000000u
    val uLong: ULong = 10000000000uL

    println("UByte: $uByte")
    println("UShort: $uShort")
    println("UInt: $uInt")
    println("ULong: $uLong")

    // 3. CONVERSÃO DE TIPOS

    val numeroInt: Int = 10
    val numeroLong: Long = numeroInt.toLong()
    val numeroDouble: Double = numeroInt.toDouble()

    println("Int: $numeroInt")
    println("Convertido para Long: $numeroLong")
    println("Convertido para Double: $numeroDouble")

    // 4. STRINGS

    val nome: String = "Kotlin"

    println("String: $nome")
    println("Tamanho: ${nome.length}")
    println("Primeiro caractere: ${nome[0]}")
    println("Maiúsculo: ${nome.uppercase()}")
    println("Minúsculo: ${nome.lowercase()}")


    // String multilinha

    val texto = """
        Esta é uma String
        com várias linhas
        em Kotlin.
    """.trimIndent()

    println("\nString multilinha:")
    println(texto)

    // 5. LISTAS

    val lista = listOf(10, 20, 30, 40)

    println("Lista: $lista")
    println("Primeiro elemento: ${lista[0]}")

    // 6. LISTA MUTAVEL

    val listaMutavel = mutableListOf(10, 20, 30)

    println("Antes: $listaMutavel")

    listaMutavel.add(40)
    listaMutavel.remove(10)

    println("Depois: $listaMutavel")

    // 7. SET

    val conjunto = setOf(10, 20, 20, 30, 30)

    println("Set: $conjunto")

    // 8. MUTABLE SET

    val conjuntoMutavel = mutableSetOf(10, 20, 30)

    conjuntoMutavel.add(40)
    conjuntoMutavel.remove(10)

    println("MutableSet: $conjuntoMutavel")

    // 9. MAP

    val idades = mapOf(
        "João" to 20,
        "Maria" to 22,
        "Carlos" to 19
    )

    println("Map: $idades")
    println("Idade da Maria: ${idades["Maria"]}")

    // 10. MAP MUTAVWL

    val idadesMutavel = mutableMapOf(
        "João" to 20,
        "Maria" to 22
    )

    idadesMutavel["Carlos"] = 19

    println("MutableMap: $idadesMutavel")

    // 11. ARRAY

    val array = arrayOf(10, 20, 30, 40)

    println("Array: ${array.contentToString()}")
    println("Primeiro elemento: ${array[0]}")
}
