public class Carros{
    Veiculos carro;
    String[] marca = {"Fiat", "Chevrolet", "Ford", "Volkswagen", "Renault", "Peugeot", "Hyundai", "Toyota", "Honda", "Nissan"};
    String[] modelo = {"Uno", "Onix", "Ka", "Gol", "Kwid", "208", "HB20", "Corolla", "Civic", "Kicks"};
    String[] cor = {"Branco", "Preto", "Prata", "Vermelho", "Azul", "Verde", "Amarelo", "Laranja", "Roxo", "Marrom"};
    int[] ano = {2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019};
    int rodas = 4;

    public Carros(Veiculos carro) {
        this.carro = carro;
    }
}