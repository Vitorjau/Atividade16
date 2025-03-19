public class Moto extends Carros{
    Veiculos moto;
    String[] marca = {"Honda", "Yamaha", "Suzuki", "Kawasaki", "Ducati", "BMW", "Triumph", "Harley-Davidson", "KTM", "Indian"};
    String[] modelo = {"CB 300", "XRE 300", "Burgman", "Ninja", "Monster", "S 1000 RR", "Street Triple", "Iron 883", "Duke", "Scout"};
    String[] cor = {"Branco", "Preto", "Prata", "Vermelho", "Azul", "Verde", "Amarelo", "Laranja", "Roxo", "Marrom"};
    int[] ano = {2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019};
    int rodas = 2;

    public Moto(Veiculos moto) {
        super(moto); // Call to the superclass constructor
        this.moto = moto;
        moto = carro;
    }
}
