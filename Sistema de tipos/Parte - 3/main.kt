// TIPOS CRIADOS

data class Centimetros(val valor: Double)

data class Polegadas(val valor: Double)

data class Jardas(val valor: Double)


// CONVERSÕES

fun Centimetros.paraPolegadas(): Polegadas {
    return Polegadas(valor / 2.54)
}

fun Centimetros.paraJardas(): Jardas {
    return Jardas(valor / 91.44)
}

fun Polegadas.paraCentimetros(): Centimetros {
    return Centimetros(valor * 2.54)
}

fun Polegadas.paraJardas(): Jardas {
    return Jardas(valor / 36.0)
}

fun Jardas.paraCentimetros(): Centimetros {
    return Centimetros(valor * 91.44)
}

fun Jardas.paraPolegadas(): Polegadas {
    return Polegadas(valor * 36.0)
}


fun main() {

    println("PARTE 3 - CRIAÇÃO DE UM TIPO")


    // 1. CENTÍMETROS

    val centimetros = Centimetros(100.0)

    println("Centímetros: ${centimetros.valor}")


    // 2. CENTÍMETROS PARA POLEGADAS

    val polegadas = centimetros.paraPolegadas()

    println("Centímetros: ${centimetros.valor}")
    println("Polegadas: ${polegadas.valor}")


    // 3. CENTÍMETROS PARA JARDAS

    val jardas = centimetros.paraJardas()

    println("Centímetros: ${centimetros.valor}")
    println("Jardas: ${jardas.valor}")


    // 4. POLEGADAS PARA CENTÍMETROS

    val dezPolegadas = Polegadas(10.0)

    val centimetrosConvertidos = dezPolegadas.paraCentimetros()

    println("Polegadas: ${dezPolegadas.valor}")
    println("Centímetros: ${centimetrosConvertidos.valor}")


    // 5. POLEGADAS PARA JARDAS

    val jardasConvertidas = dezPolegadas.paraJardas()

    println("Polegadas: ${dezPolegadas.valor}")
    println("Jardas: ${jardasConvertidas.valor}")


    // 6. JARDAS PARA CENTÍMETROS

    val duasJardas = Jardas(2.0)

    val centimetrosDeJardas = duasJardas.paraCentimetros()

    println("Jardas: ${duasJardas.valor}")
    println("Centímetros: ${centimetrosDeJardas.valor}")


    // 7. JARDAS PARA POLEGADAS

    val polegadasDeJardas = duasJardas.paraPolegadas()

    println("Jardas: ${duasJardas.valor}")
    println("Polegadas: ${polegadasDeJardas.valor}")


    // 8. TIPOS DIFERENTES

    val valorCentimetros = Centimetros(100.0)
    val valorPolegadas = Polegadas(100.0)
    val valorJardas = Jardas(100.0)

    println("Valor em centímetros: $valorCentimetros")
    println("Valor em polegadas: $valorPolegadas")
    println("Valor em jardas: $valorJardas")
}