import java.util.Random;

public class Jogo {
    private Jogador jogador;
    private int numeroSecreto;

    public Jogo(Jogador jogador) {
        this.jogador = jogador;
        Random rand = new Random();
        numeroSecreto = rand.nextInt(100) + 1;
    }

    public String jogar(int tentativa) {
        jogador.incrementarTentativas();

        if (tentativa > numeroSecreto) {
            return "maior";
        } else if (tentativa < numeroSecreto) {
            return "menor";
        } else {
            int pontos = Math.max(0, 100 - jogador.getTentativas() * 10);
            jogador.atualizarPontuacao(pontos);
            return "acertou";
        }
    }
}
