// src/Produto.java

public class Produto {
    // 1. Atributos privados
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    // 2. Construtor para inicializar o objeto
    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        // Usa os setters para garantir a validação já na criação
        setNome(nome);
        setPreco(preco);
        setQuantidadeEmEstoque(quantidadeEmEstoque);
    }

    // 3. Getters para acessar os atributos
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    // 4. Setters com validação para modificar os atributos
    public void setNome(String nome) {
        // Validação: nome não pode ser nulo ou vazio
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do produto não pode ser nulo ou vazio.");
        }
        this.nome = nome;
    }

    public void setPreco(double preco) {
        // Validação: preco não pode ser negativo
        if (preco < 0) {
            throw new IllegalArgumentException("O preço não pode ser negativo.");
        }
        this.preco = preco;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        // Validação: quantidadeEmEstoque não pode ser negativa
        if (quantidadeEmEstoque < 0) {
            throw new IllegalArgumentException("A quantidade em estoque não pode ser negativa.");
        }
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
}

// src/Produto.java (continue do código anterior)

    // ... (restante do código da classe Produto)

    // NOVO MÉTODO PARA O EXERCÍCIO 2
    public void aplicarDesconto(double porcentagem) {
        // Validação da regra de negócio: porcentagem deve estar entre 0 e 50.
        if (porcentagem < 0 || porcentagem > 50) {
            throw new IllegalArgumentException("A porcentagem de desconto deve ser entre 0 e 50.");
        }
        
        double valorDesconto = this.preco * (porcentagem / 100.0);
        this.preco = this.preco - valorDesconto;
    }
}