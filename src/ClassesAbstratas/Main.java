package ClassesAbstratas;

public class Main {
    public static void main(String[] args) {

        UzumakiSubClass Naruto = new UzumakiSubClass("Naruto Uzumaki", "Aldeia da Folha", 18);
        Naruto.mostrarNome();
        Naruto.jogaKunai();
        Naruto.estrategiaDeBatalha();

        UchihaSubClass Sasuke = new UchihaSubClass("Sasuke Uchiha", "Aldeia da Folha", 18);
        Sasuke.mostrarNome();
        Sasuke.jogaKunai();
        Sasuke.estrategiaDeBatalha();

        UchihaSubClass Itachi = new UchihaSubClass("Itachi", "Aldeia da Folha", 24);
        Itachi.mostrarNome();


    }


}
