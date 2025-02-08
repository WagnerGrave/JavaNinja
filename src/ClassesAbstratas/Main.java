package ClassesAbstratas;

public class Main {
    public static void main(String[] args) {

        UzumakiSubClass Naruto = new UzumakiSubClass("Naruto Uzumaki", "Aldeia da Folha", 18, 25, NivelNinja.GENIN);
        Naruto.mostrarNome();
        Naruto.jogaKunai();
        Naruto.estrategiaDeBatalha();

        UchihaSubClass Sasuke = new UchihaSubClass("Sasuke Uchiha", "Aldeia da Folha", 18, 25, NivelNinja.GENIN);
        Sasuke.mostrarNome();
        Sasuke.jogaKunai();
        Sasuke.estrategiaDeBatalha();

        UchihaSubClass Itachi = new UchihaSubClass("Itachi", "Aldeia da Folha", 24, 600, NivelNinja.JOUNNIN);
        Itachi.mostrarNome();

        UchihaSubClass Madara = new UchihaSubClass("Madara Uchiha", "Aldeia da Folha", 45, 900, NivelNinja.KAGE);
        Madara.mostrarNome();
        Madara.estrategiaDeBatalha();



    }


}
