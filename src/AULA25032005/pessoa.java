package AULA25032005;

public class pessoa {

    private String nome;
    private int idade;

    public pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void SetNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void SetIdade(int idade) {
     if (idade >= 18) {
         this.idade = idade;
     } else {
         System.out.println("Idade invalida");
     }
    }


    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
