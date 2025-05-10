import java.util.Random;

/**
 * A classe Jogo representa o jogo para advinhar o número secreto.
 * O jogador deve tentar adivinhar um número entre 1 e 100.
 */
public class Jogo {
    
    /**
    * O jogador que está participando do jogo 
    */
    private Jogador jogador;

    /** 
    * O número secreto que o jogador deve adivinhar 
    */
    private int numeroSecreto;

    /**
     * Construtor da classe Jogo. Inicializa o jogador e gera um número secreto aleatório.
     *
     * @param jogador O jogador que irá jogar.
     */
    public Jogo(Jogador jogador) {
        this.jogador = jogador;
        Random rand = new Random();
        numeroSecreto = rand.nextInt(100) + 1; // número entre 1 e 100
    }

    /**
     * Realiza uma tentativa do jogador e retorna o resultado.
     *
     * @param tentativa O número que o jogador tentou adivinhar.
     * @return Uma string indicando o resultado: "maior" se a tentativa for maior que o número secreto,
     *         "menor" se for menor, ou "acertou" se for igual.
     */
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
