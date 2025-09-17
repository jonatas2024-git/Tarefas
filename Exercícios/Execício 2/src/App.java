// Dentro do arquivo App.java, substitua o conteúdo do método main() por este

public class App {
    public static void main(String[] args) {

        System.out.println("--- EXERCÍCIO 2: DEMONSTRAÇÃO DO DESCONTO ---");

        // 1. Criando uma instância válida para aplicar o desconto
        Produto produto2 = new Produto("Fone de Ouvido", 300.00, 50);
        System.out.println("Produto para demonstração: " + produto2);

        // 2. Aplicando um desconto válido
        System.out.println("\n--- Exemplo 1: Aplicando um desconto válido (15%) ---");
        System.out.println("Preço antes do desconto: R$" + String.format("%.2f", produto2.getPreco()));
        
        produto2.aplicarDesconto(15.0); // Desconto de 15%
        
        System.out.println("Preço depois do desconto: R$" + String.format("%.2f", produto2.getPreco()));

        // 3. Tentando aplicar descontos inválidos
        System.out.println("\n--- Exemplo 2: Tentando aplicar descontos inválidos ---");

        // Desconto acima de 50%
        try {
            System.out.println("Tentando aplicar 60% de desconto...");
            produto2.aplicarDesconto(60.0);
        } catch (IllegalArgumentException e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        // Desconto negativo
        try {
            System.out.println("\nTentando aplicar -10% de desconto...");
            produto2.aplicarDesconto(-10.0);
        } catch (IllegalArgumentException e) {
            System.out.println("ERRO: " + e.getMessage());
        }
    }
}