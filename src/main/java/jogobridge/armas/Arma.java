package jogobridge.armas;

import jogobridge.personagens.Personagem;

public interface Arma {
    int getDurabilidade();
    int getDano();
    void atacar(int danoBaseDoJogador, Personagem jogador);
}
