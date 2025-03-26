package AtividadeEncapsulamento.EstoqueGeral;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
        // Atributos privados para encapsulamento
        private List<Produto> produtos;

        // Classe interna para representar o produto
        private class Produto {
            private String descricao;
            private int quantidade;
            private double valor;

            // Construtor do Produto
            public Produto(String descricao, int quantidade, double valor) {
                this.descricao = descricao;
                this.quantidade = quantidade;
                this.valor = valor;
            }

            // Getters para acesso controlado
            public String getDescricao() {
                return descricao;
            }

            public int getQuantidade() {
                return quantidade;
            }

            public double getValor() {
                return valor;
            }
        }

        // Construtor da classe Estoque
        public Estoque() {
            this.produtos = new ArrayList<>();
        }

        public void cadastrar(String descricao, int quantidade, double valor) {
            Produto novoProduto = new Produto(descricao, quantidade, valor);
            produtos.add(novoProduto);
            System.out.println("Produto cadastrado com sucesso!");
        }

        public void removerQuantidade(int quantidade) {
            if (produtos.isEmpty()) {
                System.out.println("Não há produtos no estoque.");
                return;
            }

            // Remove a quantidade do primeiro produto da lista
            Produto produto = produtos.get(0);

            // Verifica se há quantidade suficiente
            if (produto.getQuantidade() >= quantidade) {
                System.out.println("Quantidade removida com sucesso!");
            } else {
                System.out.println("Quantidade indisponível no estoque.");
            }
        }

        public void exibirEstoque() {
            if (produtos.isEmpty()) {
                System.out.println("Estoque vazio.");
                return;
            }

            System.out.println("--- Estoque Atual ---");
            for (Produto produto : produtos) {
                System.out.println("Descrição: " + produto.getDescricao());
                System.out.println("Quantidade: " + produto.getQuantidade());
                System.out.println("Valor: R$ " + produto.getValor());
                System.out.println("-------------------");
            }
        }
}
