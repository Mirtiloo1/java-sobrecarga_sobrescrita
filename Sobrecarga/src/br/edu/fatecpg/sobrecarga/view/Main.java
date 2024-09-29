package br.edu.fatecpg.sobrecarga.view;
import  br.edu.fatecpg.sobrecarga.model.Conversor;
import br.edu.fatecpg.sobrecarga.model.Calculadora;
import br.edu.fatecpg.sobrecarga.model.Produto;

public class Main {
    public static void main(String[] args) {

        Produto prod1 = new Produto("Martelo");
        System.out.println(prod1.descricao());
        Produto prod2 = new Produto("Celular", 2200.50);
        System.out.println(prod2.descricao());
        Produto prod3 = new Produto("Teclado", 22.50, 10);
        System.out.println(prod3.descricao());

        Calculadora calc = new Calculadora();

        System.out.println(calc.somar(2,5));
        System.out.println(calc.somar(2,3,5));
        System.out.println(calc.somar(2.3,5.3));

        Conversor conv = new Conversor();

        conv.descricao();

    }
}
