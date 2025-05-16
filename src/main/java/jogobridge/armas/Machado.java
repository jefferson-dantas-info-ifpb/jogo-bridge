package jogobridge.armas;

import jogobridge.personagens.Personagem;

public class Machado implements Arma {

    private int durabilidade = 2;

    @Override
    public int getDurabilidade() {
        return durabilidade;
    }

    @Override
    public int getDano() {
        return 4;
    }

    @Override
    public void atacar(int danoBaseDoJogador, Personagem jogador) {
        // Verifica se tem durabilidade, caso contrário não dará dano
        if (getDurabilidade() <= 0) {
            System.out.println("O machado está quebrado!");
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
        return "Machado (" + durabilidade + " durabilidade)";
    }
}
