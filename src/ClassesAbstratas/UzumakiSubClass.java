package ClassesAbstratas;

public class UzumakiSubClass extends NinjaAbstract {

    public UzumakiSubClass(){
        super();
    }

    public UzumakiSubClass(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    @Override
    public void mostrarNome() {
        System.out.println("Meu nome é: " + nome);
    }

}
