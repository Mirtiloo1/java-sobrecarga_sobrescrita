package br.edu.fatecpg.sobrecarga.model;

public class Conversor {

    public int converter(int celsius) {
        return ((celsius * 9/5) + 32);
    }

    public double converter (double km){
        return km * 0.621371;
    }

    public String converter (String text) {
        return text.toUpperCase();
    }

    public void descricao() {
        double celsius = 25.0;
        double fahrenheit = converter(celsius);
        System.out.println(celsius + " °C convertido para Fahrenheit: " + fahrenheit + " °F");

        double km = 10.0;
        double milhas = converter(km);
        System.out.println(km + "km convertido para milhas: " + milhas + " milhas");

        String texto = "Olá, mundo!";
        String textoMaiusculo = converter(texto);
        System.out.println("Texto original: '" + texto + "' convertido para maiúsculas: '" + textoMaiusculo + "'");

    }

}
