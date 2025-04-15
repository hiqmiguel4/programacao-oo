import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Placar placar = new Placar();

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();
        Jogador jogador = new Jogador(nome);
        Jogo jogo = new Jogo(jogador);

        boolean acertou = false;
        while (!acertou) {
            System.out.println("Digite um número entre 1 e 100:");
            int tentativa = scanner.nextInt();
            String resultado = jogo.jogar(tentativa);

            switch (resultado) {
                case "maior":
                    System.out.println("O número secreto é menor.");
                    break;
                case "menor":
                    System.out.println("O número secreto é maior.");
                    break;
                case "acertou":
                    System.out.println("Parabéns! Você acertou.");
                    System.out.println("Tentativas: " + jogador.getTentativas());
                    System.out.println("Pontuação: " + jogador.getPontuacao());
                    acertou = true;
                    break;
            }
        }

        placar.adicionarJogador(jogador);
        placar.mostrarRanking();
        scanner.close();
    }
}
