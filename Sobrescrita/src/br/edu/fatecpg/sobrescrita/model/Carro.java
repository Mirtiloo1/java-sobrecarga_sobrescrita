package br.edu.fatecpg.sobrescrita.model;

public class Carro extends Veiculo{

    private String model;

    public Carro(String mrc, String mdl){
        super(mrc);
        this.model = mdl;
    }
    @Override
    public void mover(){
        System.out.println("O carro esta dirigindo!");
    }
}
