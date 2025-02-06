package ClassesAbstratas;

public class Main {
    public static void main(String[] args) {

        UzumakiSubClass Naruto = new UzumakiSubClass();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.mostrarNome();
        Naruto.jogaKunai();
        Naruto.estrategiaDeBatalha();

        UchihaSubClass Sasuke = new UchihaSubClass();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.mostrarNome();
        Sasuke.jogaKunai();
        Sasuke.estrategiaDeBatalha();





    }


}
