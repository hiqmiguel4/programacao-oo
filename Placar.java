import java.util.ArrayList;

/**
 * A classe Placar representa o ranking dos jogadores do jogo.
 * Armazena os jogadores e exibe suas pontuações.
 */
public class Placar {

    /** 
    * Lista de jogadores que participaram do jogo 
    */
    private ArrayList<Jogador> ranking;

    /**
     * Construtor da classe Placar.
     * Inicializa a lista de jogadores.
     */
    public Placar() {
        ranking = new ArrayList<>();
    }

    /**
     * Adiciona um jogador ao ranking.
     *
     * @param j O jogador a ser adicionado.
     */
    public void adicionarJogador(Jogador j) {
        ranking.add(j);
    }

    /**
     * Exibe o ranking dos jogadores no console,
     * mostrando nome e pontuação de cada um.
     */
    public void mostrarRanking() {
        System.out.println("\nRanking:");
        for (Jogador j : ranking) {
            System.out.println(j.getNome() + " - " + j.getPontuacao() + " pontos");
        }
    }
}
