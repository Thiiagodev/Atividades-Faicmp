package AtividadeEncapsulamento.Estudante;

public class Estudante {
    // Atributos privados
    private String nome;
    private String cpf;
    private String curso;
    private int idade;

    // Método para cadastrar estudante
    public void cadastrarEstudante(String nome, String cpf, String curso, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.curso = curso;
        this.idade = idade;
    }

    // Método para exibir cadastro
    public void exibirCadastro() {
        System.out.println("Dados do Estudante:");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Curso: " + curso);
        System.out.println("Idade: " + idade);
    }

    // Getters para acesso controlado aos atributos
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCurso() {
        return curso;
    }

    public int getIdade() {
        return idade;
    }

    // Setters para modificação controlada dos atributos
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}