# Parte 2 — Sistema de Tipos

Esta parte apresenta características do sistema de tipos da linguagem Kotlin, especificamente:

- Tipagem forte
- Tipagem estática
- Inferência de tipos
- `val` e `var`
- Coleções somente para leitura e mutáveis

---

# 1. Tipagem forte

Kotlin possui **tipagem forte**.

Isso significa que valores de tipos diferentes não são combinados ou convertidos automaticamente de maneira arbitrária.

Por exemplo:

```kotlin
val numero: Int = 10
val texto: String = "10"

// Não permitido:
// println(numero + texto)
```

O `Int` e o `String` são tipos diferentes.

Para realizar a operação, é necessário converter explicitamente o texto:

```kotlin
val resultado = numero + texto.toInt()

println(resultado)
```

Dessa forma, a conversão fica explícita no código.

---

# 2. Tipagem estática

Kotlin é uma linguagem **estaticamente tipada**.

Isso significa que os tipos das variáveis são determinados durante a compilação.

O tipo pode ser declarado explicitamente:

```kotlin
val idade: Int = 21
```

Nesse caso, deixamos claro que `idade` é um `Int`.

---

# 3. Inferência de tipos

Apesar de possuir tipagem estática, Kotlin consegue descobrir automaticamente o tipo de uma variável.

Por exemplo:

```kotlin
val idade = 21
val altura = 1.75
val nome = "Carlos"
```

O compilador infere:

```text
idade  → Int
altura → Double
nome   → String
```

Portanto, não é necessário declarar explicitamente o tipo em todas as situações.

A linguagem continua sendo estaticamente tipada porque o compilador conhece os tipos durante a compilação.

---

# 4. `val` e `var`

Kotlin possui duas formas principais de declarar variáveis.

## `val`

Uma variável declarada com `val` não pode ser reatribuída.

```kotlin
val numero = 10

// Não permitido:
// numero = 20
```

Depois que `numero` recebe o valor `10`, a referência não pode apontar para outro valor.

---

## `var`

Uma variável declarada com `var` pode ser reatribuída.

```kotlin
var numero = 10

numero = 20

println(numero)
```

Resultado:

```text
20
```

---

# 5. `val` não significa que o objeto é necessariamente imutável

É importante diferenciar a variável do objeto ao qual ela se refere.

Por exemplo:

```kotlin
val numeros = mutableListOf(1, 2, 3)

numeros.add(4)
```

Isso é permitido.

A variável `numeros` continua apontando para a mesma lista, mas o conteúdo da lista pode ser alterado.

O que `val` impede é:

```kotlin
// Não permitido:
// numeros = mutableListOf(5, 6, 7)
```

Portanto:

> `val` impede a reatribuição da variável, mas não necessariamente torna o objeto imutável.

---

# 6. Coleções somente para leitura

Kotlin possui interfaces que permitem apenas operações de leitura.

Por exemplo:

```kotlin
val numeros = listOf(1, 2, 3)

println(numeros[0])
```

Através da interface `List`, não podemos realizar:

```kotlin
// Não permitido:
// numeros.add(4)
```

---

# 7. Coleções mutáveis

Quando é necessário modificar uma coleção, podemos utilizar `MutableList`.

```kotlin
val numeros = mutableListOf(1, 2, 3)

numeros.add(4)
numeros.remove(2)

println(numeros)
```

O mesmo princípio existe para outras coleções:

```text
List       → somente leitura
MutableList → permite alterações

Set        → somente leitura
MutableSet → permite alterações

Map        → somente leitura
MutableMap → permite alterações
```

---

# 8. Resumo do sistema de tipos

| Característica | Kotlin |
|---|---|
| Tipagem forte | Sim |
| Tipagem estática | Sim |
| Inferência de tipos | Sim |
| `val` | Não permite reatribuição |
| `var` | Permite reatribuição |
| Coleções somente leitura | Sim |
| Coleções mutáveis | Sim |

---

# Conclusão

Kotlin possui um sistema de tipos estático e forte, permitindo que muitos erros relacionados a tipos sejam identificados pelo compilador.

Ao mesmo tempo, a inferência de tipos torna o código mais conciso:

```kotlin
val numero = 10
```

em vez de:

```kotlin
val numero: Int = 10
```

A linguagem também oferece mecanismos para controlar mutabilidade através de `val`, `var` e das diferentes interfaces de coleções.