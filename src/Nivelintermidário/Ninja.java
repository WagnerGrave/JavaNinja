package Nivelintermidário;

public class Ninja {
    String nome;
    String aldeia;
    int idade;

    public String EuSouUmNinja() {
        return "Oi, Eu sou um ninja";
    }

    public int anosParaSeTornarHokage(int idadeMinimaParaSerHokage) {
        return idadeMinimaParaSerHokage - idade;
    }

}


