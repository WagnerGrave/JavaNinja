package Nivelintermidário;

public class Main {
    public static void main(String[] args) {

        // Objeto 1

        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "aldeia da Folha";
        Naruto.idade = 17;
        Naruto.ModoSabioAtivado();

        // Objeto 2

        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "aldeia da Folha";
        Sasuke.idade = 18;
        Sasuke.SharinganAtivado();

        // Objeto 3

        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = "aldeia da Folha";
        Sakura.idade = 16;
        Sakura.AtivarCura();

        // Objeto 4

        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata Hyuga";
        Hinata.aldeia = "aldeia da Folha";
        Hinata.idade = 16;
        Hinata.ativarBiakugan();

        // Objeto 5

        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto Hyuga Uzumaki";
        Boruto.aldeia = "Aldeia da Folha";
        Boruto.idade = 9;
        Boruto.ativarOKarma();
        Boruto.ModoSabioAtivado();
        Boruto.ativarJougan();

        //Objetos hokage usando construtores

        Hokage Hashirama = new Hokage("Hashirama Senju", 45, false);

        Hokage Tobirama = new Hokage("Tobirama Senju", 40, false);

        Hokage Hiruzen = new Hokage("Hiruzen Sarutobi", 70, false);

        Hokage Minato = new Hokage("Minato Namikaze", 25, false);




    }
}
