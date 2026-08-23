# Parte 3 — Criando um Tipo

Nesta parte do projeto são criados **tipos próprios em Kotlin** para representar diferentes unidades de medida.

O exemplo utilizado é a conversão entre:

- Centímetros
- Polegadas
- Jardas

A implementação não utiliza bibliotecas externas.

---

# 1. Problema

Uma maneira simples de representar uma distância seria utilizar um `Double`:

```kotlin
val distancia = 100.0
```

Porém, existe um problema: o tipo `Double` não informa qual é a unidade utilizada.

O valor poderia representar:

```text
100 centímetros
100 polegadas
100 jardas
100 metros
```

Para solucionar esse problema, podemos criar tipos específicos.

---

# 2. Criando os tipos

Foram criados três `data class`:

```kotlin
data class Centimetros(val valor: Double)

data class Polegadas(val valor: Double)

data class Jardas(val valor: Double)
```

Agora podemos representar cada unidade explicitamente:

```kotlin
val distanciaCm = Centimetros(100.0)
val distanciaPol = Polegadas(100.0)
val distanciaJardas = Jardas(100.0)
```

Apesar de todas armazenarem um `Double`, são tipos diferentes.

---

# 3. Conversões

As relações utilizadas são:

```text
1 polegada = 2,54 centímetros

1 jarda = 91,44 centímetros

1 jarda = 36 polegadas
```

---

## 3.1 Centímetros → Polegadas

A conversão é feita dividindo o valor em centímetros por `2.54`.

```kotlin
fun Centimetros.paraPolegadas(): Polegadas {
    return Polegadas(valor / 2.54)
}
```

Uso:

```kotlin
val cm = Centimetros(100.0)

val polegadas = cm.paraPolegadas()

println(polegadas.valor)
```

---

## 3.2 Centímetros → Jardas

A conversão é feita dividindo por `91.44`.

```kotlin
fun Centimetros.paraJardas(): Jardas {
    return Jardas(valor / 91.44)
}
```

---

## 3.3 Polegadas → Centímetros

A conversão é feita multiplicando por `2.54`.

```kotlin
fun Polegadas.paraCentimetros(): Centimetros {
    return Centimetros(valor * 2.54)
}
```

---

## 3.4 Polegadas → Jardas

Como uma jarda possui 36 polegadas:

```kotlin
fun Polegadas.paraJardas(): Jardas {
    return Jardas(valor / 36.0)
}
```

---

## 3.5 Jardas → Centímetros

Como uma jarda possui 91,44 centímetros:

```kotlin
fun Jardas.paraCentimetros(): Centimetros {
    return Centimetros(valor * 91.44)
}
```

---

## 3.6 Jardas → Polegadas

Como uma jarda possui 36 polegadas:

```kotlin
fun Jardas.paraPolegadas(): Polegadas {
    return Polegadas(valor * 36.0)
}
```

---

# 4. Exemplo completo

Depois de definir os tipos e as funções de conversão, podemos utilizá-los da seguinte maneira:

```kotlin
fun main() {

    val centimetros = Centimetros(100.0)

    val polegadas = centimetros.paraPolegadas()
    val jardas = centimetros.paraJardas()

    println("${centimetros.valor} centímetros")
    println("${polegadas.valor} polegadas")
    println("${jardas.valor} jardas")
}
```

Resultado aproximado:

```text
100.0 centímetros
39.37007874015748 polegadas
1.0936132983377078 jardas
```

---

# 5. Por que criar tipos próprios?

Utilizar apenas `Double` não fornece informações suficientes sobre o significado do valor.

Por exemplo:

```kotlin
val distancia1: Double = 100.0
val distancia2: Double = 100.0
```

Não há nenhuma informação no tipo que indique se cada valor representa centímetros ou polegadas.

Com os tipos criados:

```kotlin
val distancia1 = Centimetros(100.0)
val distancia2 = Polegadas(100.0)
```

o próprio código deixa claro o significado de cada valor.

Além disso, Kotlin passa a tratá-los como tipos diferentes.

---

# 6. Extensões utilizadas

As funções de conversão foram implementadas como **extension functions**.

Por exemplo:

```kotlin
fun Centimetros.paraPolegadas(): Polegadas {
    return Polegadas(valor / 2.54)
}
```

Isso permite utilizar a função diretamente sobre um objeto `Centimetros`:

```kotlin
val cm = Centimetros(100.0)

val polegadas = cm.paraPolegadas()
```

Em vez de utilizar uma função genérica como:

```kotlin
converterParaPolegadas(cm)
```

A primeira abordagem deixa a operação mais próxima do tipo ao qual ela pertence.

---

# 7. Conversões disponíveis

O projeto implementa todas as conversões entre as três unidades:

```text
Centímetros
    │
    ├──→ Polegadas
    └──→ Jardas

Polegadas
    │
    ├──→ Centímetros
    └──→ Jardas

Jardas
    │
    ├──→ Centímetros
    └──→ Polegadas
```

---

# Conclusão

A criação dos tipos `Centimetros`, `Polegadas` e `Jardas` demonstra como Kotlin permite que o programador crie abstrações próprias.

Em vez de representar todas as distâncias simplesmente como `Double`, cada unidade possui seu próprio tipo.

Isso torna o código:

- Mais explícito
- Mais legível
- Mais próximo do problema que está sendo representado
- Mais seguro contra confusão entre unidades diferentes

Essa parte demonstra, na prática, como o sistema de tipos pode ser utilizado para representar conceitos específicos de uma aplicação.