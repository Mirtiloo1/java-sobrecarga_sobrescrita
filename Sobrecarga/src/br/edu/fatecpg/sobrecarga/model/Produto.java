package br.edu.fatecpg.sobrecarga.model;

public class Produto {
    public String nome;
    public double valor;
    public int quantidadeEstoque;

    public Produto(String nome) {
        this.nome = nome;
        this.valor = 0.0;
        this.quantidadeEstoque = 0;
    }

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
        this.quantidadeEstoque = 0;
    }

    public Produto(String nome, double valor, int quantidadeEstoque) {
        this.nome = nome;
        this.valor = valor;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String descricao() {
        return "Produto: " + nome + "\nValor: " + valor + "\nQuantidade no Estoque: " + quantidadeEstoque;
    }

}
