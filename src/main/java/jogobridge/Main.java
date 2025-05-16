package jogobridge;

import jogobridge.armas.*;
import jogobridge.personagens.*;

public class Main {

    public static void main(String[] args) {
        Personagem kayo = new Esqueleto("Kayo", new Machado());
        Personagem marcos = new Guerreiro("Marcos", new Espada());
        Personagem jeff = new Ciclope("Jefferson", new Martelo());

        System.out.println(kayo);
        // +-------------------------
        // | Kayo (Esqueleto)
        // | Vida: 12
        // | Arma: Machado (2 durabilidade)
        // +-------------------------

        System.out.println(marcos);
        // +-------------------------
        // | Marcos (Guerreiro)
        // | Vida: 20
        // | Arma: Espada (4 durabilidade)
        // +-------------------------

        System.out.println(jeff);
        // +-------------------------
        // | Jefferson (Ciclope)
        // | Vida: 30
        // | Arma: Martelo (12 durabilidade)
        // +-------------------------

        kayo.atacar(jeff); // Kayo atacou Jefferson. Agora a vida de Jefferson é 25
        kayo.atacar(jeff); // Kayo atacou Jefferson. Agora a vida de Jefferson é 20
        kayo.atacar(jeff); // O machado está quebrado!

        marcos.atacar(kayo); // Marcos atacou Kayo. Agora a vida de Kayo é 8
        marcos.atacar(kayo); // Marcos atacou Kayo. Agora a vida de Kayo é 4
        marcos.atacar(kayo); // Marcos atacou Kayo. Agora a vida de Kayo é 1 <-- diminuiu 3 de dano (comportamento especial da espada)
        marcos.atacar(kayo); // Marcos atacou Kayo. Agora a vida de Kayo é 0
        marcos.atacar(jeff); // A espada está quebrada!
        
        jeff.atacar(marcos); // Jefferson atacou Marcos. Agora a vida de Marcos é 11
        jeff.atacar(marcos); // Jefferson atacou Marcos. Agora a vida de Marcos é 2
        jeff.atacar(marcos); // Jefferson atacou Marcos. Agora a vida de Marcos é 1
        jeff.atacar(marcos); // Jefferson atacou Marcos. Agora a vida de Marcos é 1 <-- comportamento do martelo (não mata)

        System.out.println(kayo);
        // +-------------------------
        // | Kayo (Esqueleto)
        // | Vida: 0 (morto)
        // | Arma: Machado (0 durabilidade)
        // +-------------------------

        System.out.println(marcos);
        // +-------------------------
        // | Marcos (Guerreiro)
        // | Vida: 1
        // | Arma: Espada (0 durabilidade)
        // +-------------------------

        System.out.println(jeff);
        // +-------------------------
        // | Jefferson (Ciclope)
        // | Vida: 20
        // | Arma: Martelo (8 durabilidade)
        // +-------------------------
    }
}
