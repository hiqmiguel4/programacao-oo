import java.util.Random;

/**
 * Arqueiro: ataque médio com chance de crítico.
 */
public class Arqueiro extends Personagem {
    private Random random = new Random();

    public Arqueiro(String nome) {
        super(nome, 150, 25);
    }

    @Override
    public void defender(int dano) {
        hp -= dano;
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " dispara Chuva de Flechas!");
        for (int i = 0; i < 3; i++) {
            int critico = random.nextInt(100) < 25 ? 2 : 1;
            System.out.println("Flecha " + (i + 1) + " com x" + critico + " de dano!");
        }
    }
}