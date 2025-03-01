# Estudo-de-POO---Java
# Estudo de Programação Orientada a Objetos (POO) em Java

Este repositório contém um estudo aprofundado sobre **Programação Orientada a Objetos (POO)** em Java, utilizando como referência as aulas do **Curso em Vídeo**. Durante esse aprendizado, foram explorados conceitos essenciais da POO, como:

- **Classes e Objetos**
- **Abstração**
- **Encapsulamento e Visibilidade**
- **Métodos Especiais** (Getters, Setters e Construtor)

## 📌 Conceitos Estudados

### 🔹 Classes e Objetos
Classes representam modelos para a criação de objetos. Um **objeto** é uma instância de uma classe com atributos e métodos próprios.

### 🔹 Abstração
A abstração permite modelar características essenciais de um objeto do mundo real, ocultando detalhes irrelevantes para sua utilização.

### 🔹 Encapsulamento
O encapsulamento protege os atributos e métodos de uma classe, restringindo seu acesso e garantindo a integridade dos dados.

### 🔹 Métodos Especiais
Os métodos **getters e setters** são utilizados para acessar e modificar atributos privados. O **construtor** inicializa os objetos no momento da sua criação.

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

---

## 🔌 Interface `Controlador`

Para a classe `Controle.java`, foi criada uma **interface** chamada `Controlador`, que define um conjunto obrigatório de métodos que a classe deve implementar:

- `ligar()` / `desligar()`
- `abrirMenu()` / `fecharMenu()`
- `maisVolume()` / `menosVolume()`
- `ligarMudo()` / `desligarMudo()`
- `play()` / `pause()`

O uso de interfaces garante **padronização e flexibilidade**, permitindo que outras classes possam implementar a mesma interface no futuro.

---

## 🚀 Conclusão

Este estudo está sendo fundamental para consolidar os conceitos de **Programação Orientada a Objetos** em Java, aplicando teoria na prática por meio da criação de classes, objetos e interfaces.

Se você deseja contribuir ou aprender mais sobre POO em Java, fique à vontade para explorar o código e sugerir melhorias! 😊

