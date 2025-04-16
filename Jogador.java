/**
 * A classe Jogador representa o jogador do jogo, contem nala as informações
 * sobre seu nome, número de tentativas e pontuação.
 */
public class Jogador {
    
    /** 
    * Nome do jogador 
    */
    private String nome;
    
    /** 
    * Número de tentativas 
    */
    private int tentativas;
    
    /** 
    * Pontuação atual 
    */
    private int pontuacao;

    /**
     * Construtor da classe Jogador.
     *
     * @param nome Nome do jogador.
     */
    public Jogador(String nome) {
        this.nome = nome;
        this.tentativas = 0;
        this.pontuacao = 0;
    }

    /**
     * Retorna o nome do jogador.
     *
     * @return O nome do jogador.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Definição do nome do jogador.
     *
     * @param nome O novo nome do jogador.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna o número de tentativas do jogador.
     *
     * @return O número de tentativas.
     */
    public int getTentativas() {
        return tentativas;
    }

    /**
     * Define o número de tentativas do jogador.
     *
     * @param tentativas O novo número de tentativas.
     */
    public void setTentativas(int tentativas) {
        this.tentativas = tentativas;
    }

    /**
     * Retorna a pontuação atual do jogador.
     *
     * @return A pontuação atual.
     */
    public int getPontuacao() {
        return pontuacao;
    }

    /**
     * Define a pontuação do jogador.
     *
     * @param pontuacao A nova pontuação.
     */
    public void set

    public void incrementarTentativas() {
        this.tentativas ++;
    }
}
