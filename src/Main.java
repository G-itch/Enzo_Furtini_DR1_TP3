import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== Menu de Exercícios de POO ===");
            System.out.println("1. Exemplo de Classe Carro");
            System.out.println("2. Testar Classe Produto");
            System.out.println("3. Testar Classe Conta Bancária");
            System.out.println("4. Testar Classes de Formas Geométricas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    testarCarro();
                    break;
                case 2:
                    testarProduto();
                    break;
                case 3:
                    testarConta();
                    break;
                case 4:
                    testarFormasGeometricas();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void testarCarro() {
        System.out.println("\n=== Testando Classe Carro ===");
        Carro meuCarro = new Carro();
        meuCarro.marca = "Toyota";
        meuCarro.ano = 2020;
        meuCarro.exibirInformacoes();
    }

    private static void testarProduto() {
        System.out.println("\n=== Testando Classe Produto ===");
        Produto produto = new Produto("Arroz", 20.50, 100);
        
        System.out.println("Produto criado:");
        produto.exibirInformacoes();
        
        System.out.println("\nAlterando preço e quantidade...");
        produto.alterarPreco(22.90);
        produto.alterarQuantidade(95);
        
        System.out.println("\nProduto após alterações:");
        produto.exibirInformacoes();
    }

    private static void testarConta() {
        System.out.println("\n=== Testando Classe Conta ===");
        Conta conta = new Conta();
        conta.titular = "João Silva";
        conta.numero = 12345;
        conta.agencia = "001";
        conta.saldo = 1000.0;
        conta.dataAbertura = "01/01/2024";

        System.out.println("Conta criada com saldo inicial: R$" + conta.saldo);
        
        System.out.println("\nRealizando depósito de R$500.00...");
        conta.deposita(500.0);
        
        System.out.println("Realizando saque de R$200.00...");
        conta.saca(200.0);
        
        double rendimento = conta.calculaRendimento();
        System.out.println("\nSaldo atual: R$" + conta.saldo);
        System.out.println("Rendimento mensal (10%): R$" + rendimento);
    }

    private static void testarFormasGeometricas() {
        System.out.println("\n=== Testando Classes de Formas Geométricas ===");
        
        Circulo circulo = new Circulo();
        circulo.raio = 3.0;
        
        Esfera esfera = new Esfera();
        esfera.raio = 5.0;
        
        System.out.println("Círculo com raio " + circulo.raio + ":");
        System.out.println("Área: " + circulo.calcularArea());
        
        System.out.println("\nEsfera com raio " + esfera.raio + ":");
        System.out.println("Volume: " + esfera.calcularVolume());
    }
}

// Classe Carro
class Carro {
    public String marca;
    public int ano;
    
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
    }
}

// Classe Produto
class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;
    
    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
    
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

// Classe Conta
class Conta {
    public String titular;
    public int numero;
    public String agencia;
    public double saldo;
    public String dataAbertura;
    
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

// Classe Circulo
class Circulo {
    public double raio;
    
    public double calcularArea() {
        return Math.PI * (raio * raio);
    }
}

// Classe Esfera
class Esfera {
    public double raio;
    
    public double calcularVolume() {
        return (4.0 / 3.0) * Math.PI * (raio * raio * raio);
    }
} 