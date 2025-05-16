package jogobridge.personagens;

import jogobridge.armas.Arma;

public class Esqueleto extends Personagem {

    public Esqueleto(String nome, Arma arma) {
        super(
                "Esqueleto",
                /* vida: */ 12,
                /* danoBase: */ 1,
                nome,
                arma
        );
    }
}
