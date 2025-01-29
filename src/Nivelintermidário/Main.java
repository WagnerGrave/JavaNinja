package Nivelintermidário;

public class Main {
    public static void main(String[] args) {

        // Criar o ninja naruto

        Uzumaki Naruto = new Uzumaki();
        Naruto.Nome = "Naruto Uzumaki";
        Naruto.Aldeia = "Aldeia da Folha";
        Naruto.Idade = 17;
        Naruto.ModoSabioAtivado();

        // Criar Uchiha Sasuke

        Uchiha Sasuke = new Uchiha();
        Sasuke.Nome = "Sasuke Uchiha";
        Sasuke.Aldeia = "Aldeia da Folha";
        Sasuke.Idade = 18;
        Sasuke.SharinganAtivado();

        // Criar ninja Sakura

        Haruno Sakura = new Haruno();
        Sakura.Nome = "Sakura Haruno";
        Sakura.Aldeia = "Aldeia da Folha";
        Sakura.Idade = 16;
        Sakura.AtivarCura();

        // Criar ninja Hinata

        Ninja Hinata = new Ninja();
        Hinata.Nome = "Hinata Hyuga";
        Hinata.Aldeia = "Aldeia da Folha";
        Hinata.Idade = 16;


    }
}
