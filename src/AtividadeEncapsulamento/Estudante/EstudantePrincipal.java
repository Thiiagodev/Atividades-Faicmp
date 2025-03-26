package AtividadeEncapsulamento.Estudante;

public class EstudantePrincipal {
    public static void main(String[] args) {
        // Criando uma instância de Estudante
        Estudante estudante = new Estudante();

        // Cadastrando um estudante
        estudante.cadastrarEstudante("João Silva", "123.456.789-00", "Computação", 22);

        // Exibindo o cadastro
        estudante.exibirCadastro();

        // Modificando alguns dados usando os setters
        estudante.setCurso("Engenharia de Software");
        estudante.setIdade(23);

        // Exibindo o cadastro atualizado
        System.out.println("\nCadastro Atualizado:");
        estudante.exibirCadastro();
    }

}
