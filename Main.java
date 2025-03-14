public class Main{

    public static void main(String[] args) {
        Veiculos veiculo = new Veiculos();
        Moto moto = new Moto();
        Carro carro = new Carro();
        
        int automovel = 0;


            for (int i = 0; i < 10; i++) {
                System.out.println(i);
    
                automovel++;
            }
    
            System.out.println("Quantidade de veiculos: " + automovel);
        }
}
