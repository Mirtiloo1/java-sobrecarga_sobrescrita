package br.edu.fatecpg.sobrescrita.model;

public class Veiculo {
    private String marca;

    public Veiculo(String mrc){
        this.marca = mrc;
    }
    public void mover(){
        System.out.println("Está se Movendo");
    }
}
