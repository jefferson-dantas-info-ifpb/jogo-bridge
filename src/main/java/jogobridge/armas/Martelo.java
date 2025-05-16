package jogobridge.armas;

import jogobridge.personagens.Personagem;

public class Martelo implements Arma {

    private int durabilidade = 12;

    @Override
    public int getDurabilidade() {
        return durabilidade;
    }

    @Override
    public int getDano() {
        return 2;
    }

    @Override
    public void atacar(int danoBaseDoJogador, Personagem jogador) {
        // Verifica se tem durabilidade, caso contrário não dará dano
        if (getDurabilidade() <= 0) {
            System.out.println("O martelo está quebrado!");
            return;
        }

        // Calcula o dano que será dado
        int danoTotal = danoBaseDoJogador + getDano();

        // Diminui a vida do jogador que foi atacado
        // Comportamento especial do martelo: ele não mata, deixa no mínimo com 1 de vida
        int vida = jogador.getVida() - danoTotal;
        jogador.setVida(vida < 1 ? 1 : vida);

        // Diminui a durabilidade da arma
        durabilidade -= 1;
    }
    
    public String toString() {
        return "Martelo (" + durabilidade + " durabilidade)";
    }
}
