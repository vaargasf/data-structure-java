# 🚀 Guia Completo de Estrutura de Dados

> Do básico ao avançado - Seu guia definitivo para dominar estruturas de dados!

---

## 📋 Índice

1. [Introdução](#introdução)
2. [Big-O Notation](#big-o-notation)
3. [Estruturas Básicas](#estruturas-básicas)
4. [Estruturas Intermediárias](#estruturas-intermediárias)
5. [Estruturas Avançadas](#estruturas-avançadas)
6. [Algoritmos de Ordenação](#algoritmos-de-ordenação)
7. [Algoritmos de Busca](#algoritmos-de-busca)
8. [Resumo de Complexidades](#resumo-de-complexidades)

---

## 🎯 Introdução

**Estrutura de Dados** é a forma como organizamos e armazenamos dados no computador para serem acessados e modificados de forma eficiente.

### Por que aprender?
- ✅ Escrever código mais rápido e eficiente
- ✅ Resolver problemas complexos
- ✅ Passar em entrevistas técnicas
- ✅ Entender como funcionam bibliotecas e frameworks

---

## 📊 Big-O Notation

Big-O descreve a **complexidade** de um algoritmo - quanto tempo/memória ele usa conforme os dados crescem.

### Complexidades Comuns (da melhor para a pior):

| Big-O | Nome | Exemplo | Descrição |
|-------|------|---------|-----------|
| **O(1)** | Constante | Acessar array[5] | Sempre o mesmo tempo |
| **O(log n)** | Logarítmico | Busca binária | Divide o problema pela metade |
| **O(n)** | Linear | Loop simples | Cresce proporcional aos dados |
| **O(n log n)** | Linearítmico | Merge Sort, Quick Sort | Eficiente para ordenação |
| **O(n²)** | Quadrático | Loop dentro de loop | Cresce rápido, evite! |
| **O(2ⁿ)** | Exponencial | Fibonacci recursivo | Muito lento, evite! |
| **O(n!)** | Fatorial | Gerar permutações | Extremamente lento |

### Visualização:

```
Tempo ↑
      |                                    O(n!)
      |                                O(2ⁿ)
      |                            O(n²)
      |                    O(n log n)
      |            O(n)
      |    O(log n)
      | O(1)
      |_________________ Tamanho dos dados →
```

### Exemplos Práticos:

```java
// O(1) - Constante
int primeiro = array[0];  // Sempre 1 operação

// O(n) - Linear
for (int i = 0; i < n; i++) {
    System.out.println(i);  // n operações
}

// O(n²) - Quadrático
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        System.out.println(i + j);  // n * n operações
    }
}

// O(log n) - Logarítmico (Busca Binária)
while (inicio <= fim) {
    meio = (inicio + fim) / 2;  // Divide pela metade
}
```

---

## 🔰 Estruturas Básicas

### 1. **Array (Vetor)** 📦

**O que é:** Lista de elementos em posições consecutivas na memória.

**Características:**
- ✅ Acesso rápido: `O(1)`
- ❌ Tamanho fixo (em Java)
- ❌ Inserção/remoção lenta no meio: `O(n)`

**Quando usar:**
- Sabe o tamanho dos dados
- Precisa de acesso rápido por índice
- Não vai inserir/remover muito

**Exemplo:**
```java
// Java
int[] numeros = new int[5];
numeros[0] = 10;  // O(1)

// JavaScript
let numeros = [10, 20, 30];
numeros[2];  // 30 - O(1)
```

**Complexidades:**
- Acesso: `O(1)`
- Busca: `O(n)`
- Inserção no final: `O(1)` ou `O(n)` se precisar redimensionar
- Inserção no meio: `O(n)`
- Remoção: `O(n)`

---

### 2. **ArrayList (Vetor Dinâmico)** 📦✨

**O que é:** Array que cresce automaticamente quando necessário.

**Características:**
- ✅ Tamanho dinâmico
- ✅ Acesso rápido: `O(1)`
- ⚠️ Redimensionamento ocasional: `O(n)`

**Como funciona:**
1. Quando enche, cria array 2x maior
2. Copia todos os elementos
3. Adiciona o novo elemento

**Exemplo:**
```java
ArrayList<String> nomes = new ArrayList<>();
nomes.add("Matheus");  // Cresce sozinho!
nomes.get(0);  // "Matheus" - O(1)
```

**Complexidades:**
- Acesso: `O(1)`
- Busca: `O(n)`
- Inserção no final: `O(1)` amortizado
- Inserção no meio: `O(n)`
- Remoção: `O(n)`

---

### 3. **Lista Ligada (Linked List)** 🔗

**O que é:** Elementos conectados por "ponteiros", espalhados na memória.

**Estrutura:**
```
[Dado|Próximo] → [Dado|Próximo] → [Dado|null]
```

**Características:**
- ✅ Inserção/remoção no início: `O(1)`
- ❌ Acesso lento: `O(n)`
- ❌ Usa mais memória (guarda ponteiros)

**Tipos:**
- **Simplesmente ligada:** Só aponta pro próximo
- **Duplamente ligada:** Aponta pro próximo E anterior

**Quando usar:**
- Muitas inserções/remoções no início
- Não precisa acessar elementos aleatoriamente
- Tamanho varia muito

**Exemplo:**
```java
class Node {
    int dado;
    Node proximo;
}

Node head = new Node(10);
head.proximo = new Node(20);
```

**Complexidades:**
- Acesso: `O(n)`
- Busca: `O(n)`
- Inserção no início: `O(1)`
- Inserção no meio/fim: `O(n)`
- Remoção no início: `O(1)`

---

### 4. **Pilha (Stack)** 📚

**O que é:** LIFO - Last In, First Out (último a entrar, primeiro a sair).

**Analogia:** Pilha de pratos - só tira do topo!

**Operações:**
- `push()`: Adiciona no topo - `O(1)`
- `pop()`: Remove do topo - `O(1)`
- `peek()`: Ver o topo sem remover - `O(1)`

**Quando usar:**
- Desfazer/Refazer (Ctrl+Z)
- Navegação entre páginas (botão voltar)
- Validar parênteses/colchetes
- Chamadas de função (call stack)

**Exemplo:**
```java
Stack<String> pilha = new Stack<>();
pilha.push("Prato 1");
pilha.push("Prato 2");
pilha.push("Prato 3");
pilha.pop();  // Remove "Prato 3"
```

**Complexidades:**
- Push: `O(1)`
- Pop: `O(1)`
- Peek: `O(1)`

---

### 5. **Fila (Queue)** 🎫

**O que é:** FIFO - First In, First Out (primeiro a entrar, primeiro a sair).

**Analogia:** Fila do banco - quem chega primeiro é atendido primeiro!

**Operações:**
- `enqueue()`: Adiciona no fim - `O(1)`
- `dequeue()`: Remove do início - `O(1)`
- `peek()`: Ver o primeiro sem remover - `O(1)`

**Quando usar:**
- Fila de impressão
- Processamento de tarefas
- BFS (busca em largura) em grafos
- Sistemas de mensagens

**Exemplo:**
```java
Queue<String> fila = new LinkedList<>();
fila.add("Pessoa 1");
fila.add("Pessoa 2");
fila.poll();  // Remove "Pessoa 1"
```

**Tipos:**
- **Fila simples:** FIFO normal
- **Fila circular:** O fim conecta com o início
- **Fila de prioridade:** Elementos têm prioridades

**Complexidades:**
- Enqueue: `O(1)`
- Dequeue: `O(1)`
- Peek: `O(1)`

---

## 🔶 Estruturas Intermediárias

### 6. **HashMap (Tabela Hash)** 🗺️

**O que é:** Armazena pares chave-valor com acesso super rápido!

**Como funciona:**
1. Usa função hash para calcular posição
2. Armazena valor nessa posição
3. Acessa direto pela chave

**Características:**
- ✅ Acesso extremamente rápido: `O(1)`
- ✅ Inserção/remoção rápidas: `O(1)`
- ❌ Não mantém ordem
- ⚠️ Colisões podem acontecer

**Quando usar:**
- Buscar valores por chave única
- Contar frequências
- Cache/Memorização
- Remover duplicatas

**Exemplo:**
```java
HashMap<String, Integer> idades = new HashMap<>();
idades.put("Messi", 36);
idades.put("CR7", 38);
int idade = idades.get("Messi");  // 36 - O(1)!
```

**Complexidades:**
- Acesso: `O(1)` médio
- Inserção: `O(1)` médio
- Remoção: `O(1)` médio
- Busca: `O(1)` médio

**Colisões:** Quando duas chaves dão a mesma posição. Resolve com:
- Encadeamento (lista ligada)
- Endereçamento aberto

---

### 7. **HashSet** 🎯

**O que é:** Conjunto de valores únicos (sem duplicatas).

**Características:**
- ✅ Não permite duplicatas
- ✅ Operações rápidas: `O(1)`
- ❌ Não mantém ordem

**Quando usar:**
- Remover duplicatas
- Verificar existência
- Operações de conjunto (união, interseção)

**Exemplo:**
```java
HashSet<Integer> numeros = new HashSet<>();
numeros.add(5);
numeros.add(5);  // Não adiciona (já existe)
numeros.contains(5);  // true - O(1)
```

**Complexidades:**
- Inserção: `O(1)`
- Remoção: `O(1)`
- Busca: `O(1)`

---

### 8. **Fila de Prioridade (Priority Queue)** 🏆

**O que é:** Fila onde elementos têm prioridades (menor valor = maior prioridade).

**Implementação:** Geralmente usa Heap binário internamente.

**Quando usar:**
- Algoritmo de Dijkstra (menor caminho)
- Escalonamento de tarefas
- Merge K listas ordenadas
- Simulações de eventos

**Exemplo:**
```java
PriorityQueue<Integer> pq = new PriorityQueue<>();
pq.add(5);
pq.add(1);
pq.add(3);
pq.poll();  // Remove 1 (menor valor)
```

**Complexidades:**
- Inserção: `O(log n)`
- Remoção (min): `O(log n)`
- Peek (ver min): `O(1)`

---

## 🔺 Estruturas Avançadas

### 9. **Árvore (Tree)** 🌳

**O que é:** Estrutura hierárquica com nó raiz e nós filhos.

**Terminologia:**
- **Raiz:** Nó no topo
- **Folha:** Nó sem filhos
- **Altura:** Distância máxima da raiz até folha
- **Profundidade:** Distância de um nó até a raiz

**Tipos:**

#### **Árvore Binária**
Cada nó tem no máximo 2 filhos.

```
       10
      /  \
     5    15
    / \   /
   3   7 12
```

#### **Árvore Binária de Busca (BST)**
- Esquerda: valores menores
- Direita: valores maiores

**Quando usar:**
- Dados hierárquicos (sistema de arquivos)
- Busca eficiente
- Operações ordenadas

**Exemplo:**
```java
class Node {
    int dado;
    Node esquerda, direita;
}
```

**Complexidades (BST balanceada):**
- Busca: `O(log n)`
- Inserção: `O(log n)`
- Remoção: `O(log n)`

**Travessias:**
- **In-Order:** Esquerda → Raiz → Direita (ordem crescente)
- **Pre-Order:** Raiz → Esquerda → Direita
- **Post-Order:** Esquerda → Direita → Raiz
- **Level-Order:** Nível por nível (BFS)

---

### 10. **Heap (Árvore Binária Completa)** 🏔️

**O que é:** Árvore binária completa onde cada pai é maior (max-heap) ou menor (min-heap) que seus filhos.

**Tipos:**
- **Min-Heap:** Raiz é o menor elemento
- **Max-Heap:** Raiz é o maior elemento

**Quando usar:**
- Implementar Priority Queue
- Algoritmo Heap Sort
- Encontrar K maiores/menores elementos

**Operações:**
- `insert()`: Adiciona e "borbulha" para cima - `O(log n)`
- `extractMin/Max()`: Remove raiz e reorganiza - `O(log n)`
- `peek()`: Ver raiz - `O(1)`

**Complexidades:**
- Inserção: `O(log n)`
- Remoção: `O(log n)`
- Acesso ao min/max: `O(1)`
- Construir heap: `O(n)`

---

### 11. **Árvore AVL** ⚖️

**O que é:** BST auto-balanceada (diferença de altura entre subárvores ≤ 1).

**Por que usar:**
- Garante operações `O(log n)` sempre
- BST comum pode virar lista no pior caso

**Rotações:**
- Simples (esquerda/direita)
- Dupla (esquerda-direita/direita-esquerda)

**Complexidades:**
- Busca: `O(log n)` garantido
- Inserção: `O(log n)` garantido
- Remoção: `O(log n)` garantido

---

### 12. **Grafo (Graph)** 🕸️

**O que é:** Conjunto de vértices (nós) conectados por arestas.

**Tipos:**
- **Direcionado:** Arestas têm direção (A → B)
- **Não-direcionado:** Arestas bidirecionais (A ↔ B)
- **Ponderado:** Arestas têm pesos/custos
- **Não-ponderado:** Todas arestas iguais

**Representações:**

1. **Matriz de Adjacência:**
```
    A  B  C
A [ 0  1  1 ]
B [ 1  0  0 ]
C [ 1  0  0 ]
```
- Espaço: `O(V²)`
- Verificar aresta: `O(1)`

2. **Lista de Adjacência:**
```
A → [B, C]
B → [A]
C → [A]
```
- Espaço: `O(V + E)`
- Verificar aresta: `O(V)`

**Quando usar:**
- Redes sociais (amizades)
- Mapas (cidades e estradas)
- Jogos (movimento entre salas)
- Dependências entre tarefas

**Algoritmos importantes:**
- **BFS** (Busca em Largura): Usa fila - `O(V + E)`
- **DFS** (Busca em Profundidade): Usa pilha/recursão - `O(V + E)`
- **Dijkstra** (Menor caminho): Com Priority Queue - `O((V + E) log V)`
- **Detecção de ciclos**
- **Componentes conectados**

---

### 13. **Trie (Árvore de Prefixos)** 🔤

**O que é:** Árvore para armazenar strings, compartilhando prefixos comuns.

**Estrutura:**
```
        root
       / | \
      c  d  t
     /   |   \
    a    o    o
   /     |     \
  t      g      p
```
Palavras: "cat", "dog", "top"

**Quando usar:**
- Autocompletar (Google, editores)
- Corretor ortográfico
- Busca de palavras com prefixo
- Dicionários

**Complexidades:**
- Inserção: `O(m)` onde m = tamanho da palavra
- Busca: `O(m)`
- Espaço: `O(ALPHABET_SIZE * N * M)`

---

## 🔄 Algoritmos de Ordenação

### Comparação Rápida:

| Algoritmo | Melhor | Médio | Pior | Espaço | Estável |
|-----------|--------|-------|------|--------|---------|
| **Bubble Sort** | O(n) | O(n²) | O(n²) | O(1) | ✅ |
| **Selection Sort** | O(n²) | O(n²) | O(n²) | O(1) | ❌ |
| **Insertion Sort** | O(n) | O(n²) | O(n²) | O(1) | ✅ |
| **Merge Sort** | O(n log n) | O(n log n) | O(n log n) | O(n) | ✅ |
| **Quick Sort** | O(n log n) | O(n log n) | O(n²) | O(log n) | ❌ |
| **Heap Sort** | O(n log n) | O(n log n) | O(n log n) | O(1) | ❌ |

### 1. **Bubble Sort** 🫧

**Como funciona:** Compara pares adjacentes e troca se estão na ordem errada.

**Quando usar:** Quase nunca! Só para ensino ou listas pequenas/quase ordenadas.

```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
            // Troca
        }
    }
}
```

---

### 2. **Merge Sort** 🔀

**Como funciona:** Divide ao meio, ordena recursivamente, depois junta ordenado.

**Quando usar:** Precisa garantir `O(n log n)` e tem memória extra disponível.

**Vantagens:**
- ✅ Sempre `O(n log n)`
- ✅ Estável
- ❌ Usa `O(n)` de memória extra

---

### 3. **Quick Sort** ⚡

**Como funciona:** Escolhe pivô, particiona (menores à esquerda, maiores à direita), repete.

**Quando usar:** Melhor para uso geral (mais rápido na prática).

**Vantagens:**
- ✅ Muito rápido na prática
- ✅ Usa pouca memória
- ❌ Pior caso `O(n²)` (raro com bom pivô)

---

## 🔍 Algoritmos de Busca

### 1. **Busca Linear** 👣

**Como funciona:** Verifica elemento por elemento.

**Complexidade:** `O(n)`

**Quando usar:** Array não ordenado ou muito pequeno.

```java
for (int i = 0; i < n; i++) {
    if (arr[i] == target) return i;
}
```

---

### 2. **Busca Binária** 🎯

**Como funciona:** Divide array ordenado pela metade repetidamente.

**Complexidade:** `O(log n)`

**Quando usar:** Array ordenado!

```java
int inicio = 0, fim = n - 1;
while (inicio <= fim) {
    int meio = (inicio + fim) / 2;
    if (arr[meio] == target) return meio;
    if (arr[meio] < target) inicio = meio + 1;
    else fim = meio - 1;
}
```

**Requisito:** Array DEVE estar ordenado!

---

## 📊 Resumo de Complexidades

### Estruturas de Dados:

| Estrutura | Acesso | Busca | Inserção | Remoção | Espaço |
|-----------|--------|-------|----------|---------|--------|
| **Array** | O(1) | O(n) | O(n) | O(n) | O(n) |
| **ArrayList** | O(1) | O(n) | O(1)* | O(n) | O(n) |
| **Linked List** | O(n) | O(n) | O(1)** | O(1)** | O(n) |
| **Stack** | O(n) | O(n) | O(1) | O(1) | O(n) |
| **Queue** | O(n) | O(n) | O(1) | O(1) | O(n) |
| **HashMap** | O(1) | O(1) | O(1) | O(1) | O(n) |
| **BST** | O(log n) | O(log n) | O(log n) | O(log n) | O(n) |
| **Heap** | O(1)*** | O(n) | O(log n) | O(log n) | O(n) |

\* Amortizado  
\*\* No início/posição conhecida  
\*\*\* Apenas min/max

---

## 🎯 Quando Usar Cada Estrutura?

### Precisa de acesso rápido por índice?
→ **Array / ArrayList**

### Muitas inserções/remoções no início?
→ **Linked List**

### Precisa de LIFO (desfazer, pilha de chamadas)?
→ **Stack**

### Precisa de FIFO (fila de tarefas)?
→ **Queue**

### Busca super rápida por chave única?
→ **HashMap**

### Valores únicos (sem duplicatas)?
→ **HashSet**

### Precisa de ordem + busca rápida?
→ **BST / TreeMap**

### Sempre pegar o menor/maior elemento?
→ **Heap / Priority Queue**

### Dados hierárquicos?
→ **Tree**

### Relacionamentos complexos?
→ **Graph**

### Autocompletar / prefixos?
→ **Trie**

---

## 💡 Dicas de Ouro

1. **Comece simples:** Array/ArrayList resolve 80% dos problemas
2. **Big-O importa:** Mas só para dados grandes (n > 1000)
3. **Perfil antes de otimizar:** Não otimize sem medir
4. **Espaço vs Tempo:** Às vezes vale usar mais memória para ser mais rápido
5. **Pratique:** LeetCode, HackerRank, Beecrowd

---

## 📚 Recursos para Estudar

### Sites:
- [VisuAlgo](https://visualgo.net) - Visualizar algoritmos
- [Big-O Cheat Sheet](https://www.bigocheatsheet.com/)
- [LeetCode](https://leetcode.com/) - Praticar

### Canais YouTube:
- CS Dojo
- Abdul Bari (inglês)
- Programação Dinâmica (português)

---

## ✅ Checklist de Aprendizado

### Básico:
- [x] Entender Big-O
- [ ] Array/ArrayList
- [ ] Linked List
- [ ] Stack
- [ ] Queue
- [ ] HashMap/HashSet

### Intermediário:
- [ ] BST
- [ ] Heap
- [ ] Busca Binária
- [ ] Merge Sort
- [ ] Quick Sort

### Avançado:
- [ ] AVL Tree
- [ ] Graph (BFS/DFS)
- [ ] Dijkstra
- [ ] Trie
- [ ] Dynamic Programming


