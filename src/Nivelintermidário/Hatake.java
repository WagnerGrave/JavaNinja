package Nivelintermidário;

public class Hatake extends Ninja implements SharinganInterface, AnbuInterface{

    public Hatake(){
        super();
    }

    public Hatake(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public void boasVindas(){
        System.out.println(nome + ": Eu sou um hatake");
    }

    @Override
    public void SharinganAtivado() {
        System.out.println("Meu nome é " + nome + ". O Sharingan Ativou.");
    }

    @Override
    public void nijnaDeElite() {
        System.out.println(nome + ": Eu sou um Ninja de elite da ANBU");
    }
}
