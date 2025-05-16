package jogobridge.armas;

import jogobridge.personagens.Personagem;

public class Espada implements Arma {

    private int durabilidade = 4;

    @Override
    public int getDurabilidade() {
        return durabilidade;
    }

    @Override
    public int getDano() {
        // Quando a espada está perto de quebrar, ela dá menos dano
        if (durabilidade <= 2) {
            return 1;
        } else {
            return 2;
        }
    }

    @Override
    public void atacar(int danoBaseDoJogador, Personagem jogador) {
        // Verifica se tem durabilidade, caso contrário não dará dano
        if (getDurabilidade() <= 0) {
            System.out.println("A espada está quebrada!");
            return;
        }

        // Calcula o dano que será dado
        int danoTotal = danoBaseDoJogador + getDano();

        // Diminui a vida do jogador que foi atacado
        jogador.setVida(jogador.getVida() - danoTotal);

        // Diminui a durabilidade da arma
        durabilidade -= 1;
    }
    
    public String toString() {
        return "Espada (" + durabilidade + " durabilidade)";
    }
}
