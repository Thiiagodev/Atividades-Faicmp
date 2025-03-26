package AtividadeEncapsulamento.Carro;

public class CarroPrincipal {

    public static void main(String[] args) {
        // Criando uma instância de Carro
        Carro carro = new Carro();

        // Definindo os atributos usando os setters
        carro.setModelo("Civic");
        carro.setMarca("Honda");
        carro.setCor("Preto");

        // Recuperando os atributos usando os getters
        System.out.println("Detalhes do Carro:");
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Cor: " + carro.getCor());
    }
}
