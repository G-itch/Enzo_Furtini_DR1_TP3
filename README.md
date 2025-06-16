# Exercícios de Programação Orientada a Objetos em Java

## Exercício 1: Conceitos de Classe, Objeto, Campos e Métodos

### O que é uma Classe?

Uma classe é um modelo ou blueprint que define a estrutura e comportamento de objetos. Ela serve como um template para criar objetos, definindo seus atributos (campos) e métodos.

### O que é um Objeto?

Um objeto é uma instância de uma classe. É uma entidade que possui estado (atributos) e comportamento (métodos). Objetos são criados a partir de classes e podem interagir entre si.

### O que são Campos (Atributos)?

Campos ou atributos são variáveis que armazenam o estado de um objeto. Eles representam as características ou propriedades que um objeto possui.

### O que são Métodos?

Métodos são funções definidas dentro de uma classe que definem o comportamento dos objetos. Eles podem manipular os atributos do objeto e realizar operações específicas.

### Exemplo Prático:

```java
public class Carro {
    // Campos (atributos)
    private String marca;
    private int ano;

    // Método que utiliza os campos
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
    }

    // Criação de objeto
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.marca = "Toyota";
        meuCarro.ano = 2020;
        meuCarro.exibirInformacoes();
    }
}
```

## Exercício 2: Classe "Produto"

### Implementação da Classe Produto:

```java
public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    // Construtor
    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
}
```

### Importância dos Atributos:

- **nome**: Identifica o produto no sistema
- **preco**: Controla o valor de venda
- **quantidadeEmEstoque**: Gerencia o inventário

## Exercício 3: Métodos Básicos da Classe "Produto"

### Implementação dos Métodos:

```java
public class Produto {
    // ... atributos anteriores ...

    public void alterarPreco(double novoPreco) {
        this.preco = novoPreco;
    }

    public void alterarQuantidade(int novaQuantidade) {
        this.quantidadeEmEstoque = novaQuantidade;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade em Estoque: " + quantidadeEmEstoque);
    }
}
```

## Exercício 4: Testando a Classe "Produto"

### Classe de Teste:

```java
public class TestaProduto {
    public static void main(String[] args) {
        Produto produto = new Produto("Arroz", 20.50, 100);

        produto.alterarPreco(22.90);
        produto.alterarQuantidade(95);
        produto.exibirInformacoes();
    }
}
```

## Exercício 5: Getters e Setters

### Implementação:

```java
public class Produto {
    // ... atributos anteriores ...

    // Getters
    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    public int getQuantidadeEmEstoque() { return quantidadeEmEstoque; }

    // Setters
    public void setNome(String nome) { this.nome = nome; }
    public void setPreco(double preco) { this.preco = preco; }
    public void setQuantidadeEmEstoque(int quantidade) {
        this.quantidadeEmEstoque = quantidade;
    }
}
```

## Exercício 6: Construtores

### Implementação do Construtor:

```java
public class Produto {
    // ... atributos anteriores ...

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
}
```

## Exercício 7: Classe Conta Bancária

### Implementação:

```java
public class Conta {
    private String titular;
    private int numero;
    private String agencia;
    private double saldo;
    private String dataAbertura;
}
```

## Exercício 8: Métodos da Classe Conta

### Implementação:

```java
public class Conta {
    // ... atributos anteriores ...

    public void saca(double valor) {
        this.saldo -= valor;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public double calculaRendimento() {
        return this.saldo * 0.1;
    }
}
```

## Exercício 9: Testando a Classe Conta

### Classe de Teste:

```java
public class TestaConta {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.titular = "João Silva";
        conta.numero = 12345;
        conta.agencia = "001";
        conta.saldo = 1000.0;
        conta.dataAbertura = "01/01/2024";

        conta.deposita(500.0);
        conta.saca(200.0);
        double rendimento = conta.calculaRendimento();

        System.out.println("Saldo atual: " + conta.saldo);
        System.out.println("Rendimento: " + rendimento);
    }
}
```

## Exercício 10: Classes de Formas Geométricas

### Implementação:

```java
public class Circulo {
    private double raio;
}

public class Esfera {
    private double raio;
}
```

## Exercício 11: Métodos de Cálculo

### Implementação:

```java
public class Circulo {
    private double raio;

    public double calcularArea() {
        return Math.PI * (raio * raio);
    }
}

public class Esfera {
    private double raio;

    public double calcularVolume() {
        return (4.0 / 3.0) * Math.PI * (raio * raio * raio);
    }
}
```

## Exercício 12: Testando as Classes de Figuras

### Classe de Teste:

```java
public class TestaFiguras {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.raio = 3.0;

        Esfera esfera = new Esfera();
        esfera.raio = 5.0;

        System.out.println("Área do círculo: " + circulo.calcularArea());
        System.out.println("Volume da esfera: " + esfera.calcularVolume());
    }
}
```
