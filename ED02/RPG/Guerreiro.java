/**
 * Guerreiro: ataque forte e defesa com redução de dano.
 */
public class Guerreiro extends Personagem {
    public Guerreiro(String nome) {
        super(nome, 200, 30);
    }

    @Override
    public void defender(int dano) {
        hp -= dano / 2;
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " usa Golpe Duplo!");
        ataqueBase *= 2;
    }
}