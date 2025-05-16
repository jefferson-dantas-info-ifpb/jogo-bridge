package jogobridge.personagens;

import jogobridge.armas.Arma;

public class Ciclope extends Personagem {

    public Ciclope(String nome, Arma arma) {
        super(
                "Ciclope",
                /* vida: */ 30,
                /* danoBase: */ 7,
                nome,
                arma
        );
    }
}
