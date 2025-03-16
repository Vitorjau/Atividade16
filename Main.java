public class Main{

    public static void main(String[] args) {
        Carros carro;
        Moto moto;
        moto = new Moto(new Veiculos("", "", "", 0, 0));
        carro = new Carros(new Veiculos("", "", "", 0, 0));
        int automovel = 0;

        System.out.println("Lista de automovéis:");
            for (int i = 0; i < 10; i++) {
                automovel = i;
                automovel++;
                if (carro.rodas == 4) {
                    System.out.println("Carro: " + carro.marca[i] + " - " + carro.modelo[i] + " - " + carro.cor[i] + " - " + carro.ano[i] + " - " + carro.rodas);
                } else if (carro.rodas == 2) {
                    System.out.println("Moto: " + moto.marca[i] + " - " + moto.modelo[i] + " - " + moto.cor[i] + " - " + moto.ano[i] + " - " + moto.rodas);
                }
            }
            /* 
            System.out.println("Lista de motos:");
            for (int i = 0; i < 10; i++) {
                System.out.println(moto.marca[i] + " - " + moto.modelo[i] + " - " + moto.cor[i] + " - " + moto.ano[i] + " - " + moto.rodas);
                System.out.println(carro.marca[i] + " - " + carro.modelo[i] + " - " + carro.cor[i] + " - " + carro.ano[i] + " - " + carro.rodas);
                automovel = i;
                automovel++;
            }
            */

            System.out.println("Quantidade de veiculos: " + automovel);
        }
}
