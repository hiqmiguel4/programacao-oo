/**
 * Mago: ataque mágico, defesa fraca.
 */
public class Mago extends Personagem {
    public Mago(String nome) {
        super(nome, 120, 40);
    }

    @Override
    public void defender(int dano) {
        hp -= dano;
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " lança Bola de Fogo!");
        ataqueBase += 10;
    }
}