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

}


