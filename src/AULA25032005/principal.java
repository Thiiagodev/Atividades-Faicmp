package AULA25032005;

public class principal {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("Thiago", 2500);

        conta.eixibirDados();
        conta.depositar(200);
        conta.sacar(50);

//        pessoa p = new pessoa("Thiago", 33);
//        System.out.println("Nome: " + p.getNome());
//        System.out.println("Idade: " + p.getIdade());
//
//p.SetNome("lindao");
//p.SetIdade(243);
//
//p.SetIdade(2000);
//p.mostrarDados();

    }
}
