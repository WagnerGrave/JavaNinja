package ClassesAbstratas;

public class UchihaSubClass extends NinjaAbstract{

    public UchihaSubClass(){
        super();
    }

    public UchihaSubClass(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    public UchihaSubClass(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    @Override
    public void mostrarNome() {
        System.out.println("Meu nome é: " + nome + " Eu ja completei: " + numeroDeMissoesConcluidas + " Missões");
    }

    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Meu nome é: " + nome + " E essa é minha inteligencia de combate");
    }

    @Override
    public void inteligenciaDeCombate(int qi) {

        if (qi > 150) {
            System.out.println("Seu QI é: " + qi + " e voce é um genio");
        } else if (qi >= 130) {
            System.out.println("Seu QI é: " + qi + " e voce é um ninja promissor");
        }else {
            System.out.println("Seu QI é: " + qi + " e voce e voce precisa treinar mais suas estrategias");
        }

    }

}


