/**
 * A classe Jogador representa um jogador de um jogo, contendo informações
 * sobre seu nome, número de tentativas e pontuação.
 */
public class Jogador {
    
    /** 
    * Nome do jogador 
    */
    private String nome;
    
    /** 
    * Número de tentativas feitas pelo jogador 
    */
    private int tentativas;
    
    /** 
    * Pontuação atual do jogador 
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
     * Define o nome do jogador.
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
    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    /**
     * Atualiza a pontuação do jogador somando o valor informado.
     *
     * @param valor Valor a ser adicionado à pontuação.
     */
    public void atualizarPontuacao(int valor) {
        this.pontuacao += valor;
    }

    /**
     * Incrementa o número de tentativas do jogador em 1.
     */
    public void incrementarTentativas() {
        this.tentativas++;
    }
}
