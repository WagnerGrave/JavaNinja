package ClassesAbstratas;

public abstract class NinjaAbstract implements NinjaInterface{

    //TODO: Incluir 2 novos atributos: numeroDeMissoesConcluidas , Rank
    //TODO: Rank: Gennin, Chunnin, Jounnin, Kage

    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;

    public NinjaAbstract() {
    }

    public NinjaAbstract(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    //TODO: Sobrecarga do construtor chamando novos atributos

    public NinjaAbstract(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    public abstract void mostrarNome();

    public void jogaKunai(){
        System.out.println("Eu joguei uma kunai");
    }

    @Override
    public void estrategiaDeBatalha() {
        System.out.println("Essa é minha estrategia de batalha");
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

    // Metodo sem Override

    public void metodoProvisorio() {
        System.out.println("teste na classe ninja");
    }

    @Override
    public String toString() {
        return "Esse é o metodo para referencia de memoria";
    }
}
