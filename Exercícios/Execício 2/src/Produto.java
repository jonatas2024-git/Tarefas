// src/Produto.java

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        setNome(nome);
        setPreco(preco);
        setQuantidadeEmEstoque(quantidadeEmEstoque);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do produto não pode ser nulo ou vazio.");
        }
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            throw new IllegalArgumentException("O preço não pode ser negativo.");
        }
        this.preco = preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        if (quantidadeEmEstoque < 0) {
            throw new IllegalArgumentException("A quantidade em estoque não pode ser negativa.");
        }
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + " | Preço: R$" + String.format("%.2f", preco) + " | Estoque: " + quantidadeEmEstoque;
    }
    
    // --- NOVO MÉTODO PARA O EXERCÍCIO 2 ---
    
    /**
     * Aplica um desconto ao preço do produto.
     * @param porcentagem A porcentagem de desconto a ser aplicada (de 0 a 50).
     * @throws IllegalArgumentException se a porcentagem estiver fora do intervalo permitido.
     */
    public void aplicarDesconto(double porcentagem) {
        // Validação da regra de negócio: porcentagem deve estar entre 0 e 50.
        if (porcentagem < 0 || porcentagem > 50) {
            throw new IllegalArgumentException("A porcentagem de desconto deve ser entre 0 e 50.");
        }
        
        // Aplica o desconto ao preço
        double valorDesconto = this.preco * (porcentagem / 100.0);
        this.preco = this.preco - valorDesconto;
        
        // Opcional: Para evitar números com muitas casas decimais
        this.preco = Math.round(this.preco * 100.0) / 100.0;
    }
}