package ClassesAbstratas;

public abstract class NinjaAbstract implements NinjaInterface{
    String nome;
    String aldeia;
    int idade;
    int missoes;
    double saldoBancario;
    double altura;
    boolean vivoouNao;

    public abstract void mostrarNome();

    public void jogaKunai(){
        System.out.println("Eu joguei uma kunai");
    }

    @Override
    public void estrategiaDeBatalha() {
        System.out.println("Essa é minha estrategia de batalha");
    }
}
