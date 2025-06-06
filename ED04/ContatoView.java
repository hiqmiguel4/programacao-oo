package ed04;

import java.util.List;
import java.util.Scanner;

/**
 * Classe responsável pela interação com o usuário via console.
 */
public class ContatoView {
    private Scanner scanner = new Scanner(System.in);

    public void exibirMenu() {
        System.out.println("=== AGENDA DE CONTATOS ===");
        System.out.println("1 - Adicionar Pessoa Física");
        System.out.println("2 - Adicionar Pessoa Jurídica");
        System.out.println("3 - Listar Contatos");
        System.out.println("4 - Remover Contato");
        System.out.println("0 - Sair");
    }

    public void mostrarContatos(List<ContatoBase> contatos) {
        System.out.printf("%-20s %-15s %-20s %-15s%n", "Nome", "Telefone", "Email", "CPF/CNPJ");
        for (ContatoBase contato : contatos) {
            String id = contato.getIdentificador();
            System.out.printf("%-20s %-15s %-20s %-15s%n", contato.getNome(), contato.getTelefone(), contato.getEmail(), id);
        }
    }

    public Scanner getScanner() {
        return scanner;
    }
}