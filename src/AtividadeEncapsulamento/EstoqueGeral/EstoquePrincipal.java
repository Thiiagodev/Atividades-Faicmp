package AtividadeEncapsulamento.EstoqueGeral;

public class EstoquePrincipal {

    public static void main(String[] args) {
        // Criando uma instância do Estoque
        Estoque estoque = new Estoque();

        // Cadastrando produtos
        estoque.cadastrar("Notebook", 10, 2500.50);
        estoque.cadastrar("Smartphone", 20, 1500.75);

        // Exibindo o estoque
        estoque.exibirEstoque();

        // Removendo quantidade
        estoque.removerQuantidade(5);

        // Exibindo o estoque novamente
        estoque.exibirEstoque();
    }

}
