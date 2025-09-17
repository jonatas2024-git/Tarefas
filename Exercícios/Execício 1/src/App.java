// src/App.java

public class App {
    public static void main(String[] args) {
        System.out.println("--- Exercício 2: Encapsulamento com Desconto ---");

        Produto produto2 = new Produto("Fone Bluetooth", 250.00, 30);
        System.out.println("\nProduto antes do desconto: " + produto2.getNome() + ", Preço: R$" + produto2.getPreco());

        // Caso 1: Aplica um desconto válido
        System.out.println("\n-> Aplicando 15% de desconto:");
        produto2.aplicarDesconto(15.0);
        System.out.println("Preço após o desconto: R$" + produto2.getPreco());

        // Caso 2: Tentando aplicar um desconto inválido
        System.out.println("\n-> Tentando aplicar 60% de desconto (inválido):");
        try {
            produto2.aplicarDesconto(60.0);
        } catch (IllegalArgumentException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        // Caso 3: Tentando aplicar um desconto negativo
        System.out.println("\n-> Tentando aplicar -5% de desconto (inválido):");
        try {
            produto2.aplicarDesconto(-5.0);
        } catch (IllegalArgumentException e) {
            System.out.println("ERRO: " + e.getMessage());
        }
    }
}