package jogobridge.personagens;

import jogobridge.armas.Arma;

public abstract class Personagem {

    private final String descricao;
    private int vida;
    private final int danoBase;
    private final String nome;
    private final Arma arma;

    public Personagem(
            String descricao,
            int vida,
            int danoBase,
            String nome,
            Arma arma
    ) {
        this.descricao = descricao;
        this.vida = vida;
        this.danoBase = danoBase;
        this.nome = nome;
        this.arma = arma;
    }

    public void atacar(Personagem jogador) {
        if (vida <= 0) {
            System.out.println("Você não pode atacar pois está morto!");
            return;
        }
        
        arma.atacar(danoBase, jogador);
        System.out.println(nome + " atacou " + jogador.nome + ". Agora a vida de " + jogador.nome + " é " + jogador.vida);
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida < 0 ? 0 : vida;
    }

    public String toString() {
        return "+-------------------------\n"
                + "| " + nome + " (" + descricao + ")\n"
                + "| Vida: " + vida + (vida <= 0 ? " (morto)" : "") + "\n"
                + "| Arma: " + arma + "\n"
                + "+-------------------------\n";
    }
}
