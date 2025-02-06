package ClassesAbstratas;

public abstract class NinjaAbstract implements NinjaInterface{
    String nome;
    String aldeia;
    int idade;

    public NinjaAbstract() {
    }

    public NinjaAbstract(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    public abstract void mostrarNome();

    public void jogaKunai(){
        System.out.println("Eu joguei uma kunai");
    }

    @Override
    public void estrategiaDeBatalha() {
        System.out.println("Essa é minha estrategia de batalha");
    }
}
