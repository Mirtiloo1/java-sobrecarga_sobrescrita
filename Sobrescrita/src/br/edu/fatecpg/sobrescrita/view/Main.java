package br.edu.fatecpg.sobrescrita.view;

import br.edu.fatecpg.sobrescrita.model.Pagamento;
import br.edu.fatecpg.sobrescrita.model.PagamentoBoleto;
import br.edu.fatecpg.sobrescrita.model.PagamentoCartao;
import br.edu.fatecpg.sobrescrita.model.Bicicleta;
import br.edu.fatecpg.sobrescrita.model.Carro;
import br.edu.fatecpg.sobrescrita.model.Veiculo;

public class Main {

    public static void main(String[] args) {

        Veiculo vecu = new Veiculo("Renault");
        Carro car = new Carro("Renault", "kwid");
        Bicicleta bike = new Bicicleta("Caloi", "preto");

        car.mover();
        bike.mover();


        PagamentoCartao Pc = new PagamentoCartao();
        Pc.processarPagamento();

        PagamentoBoleto Pb = new PagamentoBoleto();
        Pb.processarPagamento();

        Pagamento P = new Pagamento();
        P.processarPagamento();

    }
}
