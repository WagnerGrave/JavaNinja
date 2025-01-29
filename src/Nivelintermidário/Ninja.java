package Nivelintermidário;

public class Ninja {
    String Nome;
    String Aldeia;
    int Idade;

    public String EuSouUmNinja() {
        return "Oi, Eu sou um ninja";
    }

    public int anosParaSeTornarHokage(int idadeMinimaParaSerHokage) {
        return idadeMinimaParaSerHokage - Idade;
    }
}


