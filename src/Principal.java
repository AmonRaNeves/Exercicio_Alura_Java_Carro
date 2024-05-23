public class Principal {
    public static void main(String[] args){

        Carro Carro1 = new Carro();
        Carro1.modelo = "Toyota supra";
        Carro1.ano = 1937;
        Carro1.cor = "Branco";

        Carro Carro2 = new Carro();
        Carro2.modelo = "Fiat uno";
        Carro2.ano = 1899;
        Carro2.cor = "Vermelho";

        Carro1.exibirFicha();
        Carro2.exibirFicha();




    }
}
