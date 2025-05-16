package jogobridge.personagens;

import jogobridge.armas.Arma;

public class Guerreiro extends Personagem {

    public Guerreiro(String nome, Arma arma) {
        super(
                "Guerreiro",
                /* vida: */ 20,
                /* danoBase: */ 2,
                nome,
                arma
        );
    }
}
