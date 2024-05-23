public class Carro{
    String modelo;
    int ano;
    String cor;
    int resultadoIdade;


    public void exibirFicha(){
        System.out.println("O modelo do carro é: " + modelo);
        System.out.println("Ano de fabricação: " + ano);
        System.out.println("Car do carro: "+ cor);
        System.out.println("O "+ modelo +" tem: "+ idadeDoCarro() + " Anos");
        System.out.println();
    }

    int idadeDoCarro() {
        return resultadoIdade = 2024 - this.ano;

    }

}
