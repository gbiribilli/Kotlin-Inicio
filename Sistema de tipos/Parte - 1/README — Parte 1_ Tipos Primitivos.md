# Parte 1 — Tipos Primitivos

Esta parte do projeto apresenta como o Kotlin trabalha com **tipos numéricos, Strings e coleções**, utilizando apenas recursos disponíveis na biblioteca padrão da linguagem.

---

## 1. Tipos numéricos

Kotlin possui diversos tipos numéricos, permitindo especificar o tamanho e o tipo de representação do valor.

### Tipos inteiros

| Tipo | Tamanho |
|---|---:|
| `Byte` | 8 bits |
| `Short` | 16 bits |
| `Int` | 32 bits |
| `Long` | 64 bits |

Exemplo:

```kotlin
val numeroByte: Byte = 100
val numeroShort: Short = 30000
val numeroInt: Int = 100000
val numeroLong: Long = 10000000000L
```

### Números de ponto flutuante

Kotlin possui:

- `Float` — 32 bits
- `Double` — 64 bits

```kotlin
val numeroFloat: Float = 3.14f
val numeroDouble: Double = 3.1415926535
```

O `Double` possui maior precisão e é o tipo normalmente utilizado quando se trabalha com números de ponto flutuante.

---

## 2. Tipos unsigned

Kotlin também possui tipos para números inteiros sem sinal:

- `UByte`
- `UShort`
- `UInt`
- `ULong`

Exemplo:

```kotlin
val numeroUByte: UByte = 200u
val numeroUShort: UShort = 60000u
val numeroUInt: UInt = 4000000000u
val numeroULong: ULong = 10000000000uL
```

Esses tipos permitem representar valores inteiros sem utilizar o bit para representar números negativos.

---

## 3. Conversão de números

Kotlin não realiza automaticamente a conversão entre tipos numéricos diferentes.

Por exemplo:

```kotlin
val numero: Int = 10

// Não permitido:
// val numeroLong: Long = numero
```

É necessário realizar uma conversão explícita:

```kotlin
val numeroLong: Long = numero.toLong()
```

Também existem métodos como:

```kotlin
numero.toByte()
numero.toShort()
numero.toInt()
numero.toLong()
numero.toFloat()
numero.toDouble()
```

---

# 4. Strings

O tipo utilizado para representar textos em Kotlin é `String`.

```kotlin
val nome: String = "Kotlin"

println(nome)
println(nome.length)
println(nome[0])
println(nome.uppercase())
println(nome.lowercase())
```

Kotlin também permite criar Strings multilinha utilizando três aspas:

```kotlin
val texto = """
    Primeira linha
    Segunda linha
    Terceira linha
""".trimIndent()
```

---

## 5. Strings são imutáveis

Uma `String` não pode ser modificada diretamente.

Por exemplo:

```kotlin
val palavra = "Kotlin"

// Não permitido:
// palavra[0] = 'J'
```

Em vez de alterar a String existente, é criada uma nova:

```kotlin
val novaPalavra = "J" + palavra.substring(1)

println(novaPalavra)
```

---

# 6. Coleções

Kotlin possui diferentes tipos de coleções na biblioteca padrão.

As principais utilizadas neste projeto são:

- `List`
- `MutableList`
- `Set`
- `MutableSet`
- `Map`
- `MutableMap`
- `Array`

---

## 6.1 List

`List` representa uma coleção ordenada que permite acesso por índice.

```kotlin
val numeros = listOf(10, 20, 30, 40)

println(numeros[0])
```

A interface `List` não fornece operações para modificar a coleção.

---

## 6.2 MutableList

`MutableList` permite modificar seus elementos.

```kotlin
val numeros = mutableListOf(10, 20, 30)

numeros.add(40)
numeros.remove(10)

println(numeros)
```

---

## 6.3 Set

`Set` representa um conjunto de elementos sem duplicatas.

```kotlin
val numeros = setOf(10, 20, 20, 30, 30)

println(numeros)
```

O resultado contém cada valor apenas uma vez.

---

## 6.4 MutableSet

Assim como `Set`, não permite elementos duplicados, mas permite alterações.

```kotlin
val numeros = mutableSetOf(10, 20, 30)

numeros.add(40)
numeros.remove(20)

println(numeros)
```

---

## 6.5 Map

`Map` armazena pares de **chave e valor**.

```kotlin
val idades = mapOf(
    "João" to 20,
    "Maria" to 22,
    "Carlos" to 19
)

println(idades["Maria"])
```

Nesse exemplo, o nome é a chave e a idade é o valor.

---

## 6.6 MutableMap

`MutableMap` permite adicionar, alterar e remover elementos.

```kotlin
val idades = mutableMapOf(
    "João" to 20,
    "Maria" to 22
)

idades["Carlos"] = 19
```

---

## 6.7 Array

Kotlin também possui arrays.

```kotlin
val numeros = arrayOf(10, 20, 30, 40)

println(numeros[0])
```

Existem também arrays especializados para tipos primitivos:

```kotlin
val numeros = intArrayOf(1, 2, 3, 4, 5)
```

---

# Conclusão

Nesta parte foram demonstrados os principais tipos e estruturas básicas utilizados pelo Kotlin:

- `Byte`
- `Short`
- `Int`
- `Long`
- `Float`
- `Double`
- `UByte`
- `UShort`
- `UInt`
- `ULong`
- `String`
- `Array`
- `List`
- `MutableList`
- `Set`
- `MutableSet`
- `Map`
- `MutableMap`

Também foram demonstradas conversões numéricas, Strings imutáveis e a diferença entre coleções somente para leitura e coleções mutáveis.