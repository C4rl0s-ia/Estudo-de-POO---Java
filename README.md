# Estudo de Programação Orientada a Objetos (POO) em Java

Este repositório contém um estudo aprofundado sobre **Programação Orientada a Objetos (POO)** em Java, utilizando como referência as aulas do **Curso em Vídeo**. Durante esse aprendizado, foram explorados conceitos essenciais da POO, como:

- **Classes e Objetos**
- **Abstração**
- **Encapsulamento e Visibilidade**
- **Métodos Especiais** (Getters, Setters e Construtor)
- **Relacionamento entre classes (Agregação)**
- **Interfaces**
- **Padrões de Projeto (Design Patterns)**

## 📌 Conceitos Estudados

### 🔹 Classes e Objetos
Classes representam modelos para a criação de objetos. Um **objeto** é uma instância de uma classe com atributos e métodos próprios.

### 🔹 Abstração
A abstração permite modelar características essenciais de um objeto do mundo real, ocultando detalhes irrelevantes para sua utilização.

### 🔹 Encapsulamento
O encapsulamento protege os atributos e métodos de uma classe, restringindo seu acesso e garantindo a integridade dos dados.

### 🔹 Métodos Especiais
Os métodos **getters e setters** são utilizados para acessar e modificar atributos privados. O **construtor** inicializa os objetos no momento da sua criação.

### 🔹 Relacionamento entre Classes (Agregação)
A agregação foi estudada e aplicada na relação entre as classes `Lutador` e `Luta`. A classe `Luta` possui instâncias de `Lutador`, mas os lutadores existem independentemente da luta.

---

## 🏗️ Classes Criadas

Foram desenvolvidas várias classes para aplicar os conceitos estudados. Cada uma representa um objeto do mundo real e contém atributos e métodos para manipulação dos dados.

### 1️⃣ **Caneta.java**
- Representa um objeto **Caneta** com atributos como `modelo`, `cor`, `ponta`, `carga` e `tampada`.
- Implementa métodos especiais (`getters` e `setters`) e métodos de ação como `tampar()` e `destampar()`.

### 2️⃣ **Celular.java**
- Representa um **Celular** com atributos como `modelo`, `marca`, `tamanhoTela`, `quantCamera` e `bateria`.
- Contém métodos para ligar, desligar e tirar fotos.

### 3️⃣ **ContaBanco.java**
- Modela uma **conta bancária**, podendo ser `Conta Corrente (CC)` ou `Conta Poupança (CP)`.
- Possui métodos para **abrir conta, fechar conta, depositar, sacar e pagar mensalidade**.

### 4️⃣ **Controle.java** (com Interface `Controlador`)
- Implementa um **Controle Remoto** com funcionalidades para aumentar/diminuir volume, ligar/desligar e tocar/pausar.
- Usa **encapsulamento** para proteger atributos como `volume`, `ligado` e `tocando`.
- Implementa a interface `Controlador`, garantindo um conjunto padrão de métodos obrigatórios.

### 5️⃣ **Estilo.java**
- Representa um **Estilo** de vestimenta com atributos como `roupa`, `marca`, `comportamento`, `local` e `valor`.
- Possui métodos para exibição e alteração de estilo.

### 6️⃣ **Song.java**
- Modela uma **música**, com atributos como `nome`, `melodia`, `acorde`, `instrumento` e `time`.
- Métodos implementados incluem `play()`, `dontPlay()`, `repetir()` e `pular()`.

### 7️⃣ **Lutador.java** *(Atualizado)*
- Representa um **lutador** com atributos como `nome`, `nacionalidade`, `idade`, `altura`, `peso` e `categoria`.
- Possui métodos para apresentar, exibir status e atualizar seu histórico de lutas.
- A lógica foi aprimorada com um método **`calcularForca()`**, que considera vitórias, experiência, idade e peso do lutador para simular seu desempenho em uma luta.
- Também foram adicionadas **cores no terminal** usando a classe `CoresTerminal` para tornar a apresentação mais visual e envolvente.

### 8️⃣ **Luta.java** *(Atualizado)*
- Representa um **evento de luta**, utilizando agregação com a classe `Lutador`.
- Atualizado com uma lógica de combate mais dinâmica: considera **força base**, **fatores aleatórios de bônus e dano**, permitindo que os combates sejam mais realistas e imprevisíveis.
- A definição do vencedor é baseada no seguinte critério:
    - Cada lutador tem sua força calculada através do método `calcularForca()`;
    - Um **fator aleatório de bônus** é adicionado à força inicial, representando sorte ou desempenho excepcional durante a luta;
    - Um **fator de dano aleatório** é subtraído, representando cansaço, acertos do oponente e quedas de desempenho;
    - O resultado final é a força ajustada (**força + bônus - dano**);
    - O lutador com maior força ajustada é o vencedor. Se os valores forem iguais, a luta termina em empate.
- Utiliza também a classe `CoresTerminal` para dar destaque visual ao status e resultados da luta.

### 9️⃣ **CoresTerminal.java** *(Nova Classe)*
- Classe utilitária que fornece constantes ANSI para estilização de texto no terminal.
- Permite mudar **cores de texto, fundo e até criar cores personalizadas com ANSI 256 e RGB**.

---

## 🔌 Interfaces Criadas

### **Interface `Controlador`** (Para `Controle.java`)
Define um conjunto obrigatório de métodos para manipular um controle remoto:
- `ligar()` / `desligar()`
- `abrirMenu()` / `fecharMenu()`
- `maisVolume()` / `menosVolume()`
- `ligarMudo()` / `desligarMudo()`
- `play()` / `pause()`

### **Interface `ControladorCaneta`** (Para `Caneta.java`)
Criada para estudo, essa interface define métodos essenciais para uma caneta:
- `tampar()` / `destampar()`
- `rabiscar()`
- `status()`

O uso de interfaces garante **padronização e flexibilidade**, permitindo que outras classes possam implementar comportamentos similares.

---

## 🔜 Próximos Passos

Os próximos estudos incluirão:
- **Herança e Polimorfismo**: Explorando como as classes podem herdar atributos e métodos de outras classes e como os métodos podem ser sobrescritos para comportamentos específicos.
- **SOLID**: Implementação e estudo detalhado dos princípios **Single Responsibility, Open/Closed, Liskov Substitution, Interface Segregation e Dependency Inversion** para melhorar a arquitetura do código.
- **Padrões de Projeto Avançados**: Implementação de padrões como **Strategy, Adapter e Composite** para melhorar a estrutura do código.

---

## 🚀 Conclusão

Este estudo foi fundamental para consolidar os conceitos de **Programação Orientada a Objetos** em Java, aplicando teoria na prática por meio da criação de classes, objetos e interfaces.

Se você deseja contribuir ou aprender mais sobre POO em Java, fique à vontade para explorar o código e sugerir melhorias! 😊

