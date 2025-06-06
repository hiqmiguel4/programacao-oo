package ed04;

/**
 * Classe principal para executar a aplicação de agenda de contatos.
 */
public class Main {
    public static void main(String[] args) {
        ContatoController controller = new ContatoController();
        ContatoView view = new ContatoView();
        boolean executando = true;

        while (executando) {
            view.exibirMenu();
            int opcao = Integer.parseInt(view.getScanner().nextLine());

            try {
                switch (opcao) {
                    case 1 -> {
                        System.out.print("Nome: ");
                        String nome = view.getScanner().nextLine();
                        System.out.print("Telefone: ");
                        String tel = view.getScanner().nextLine();
                        System.out.print("Email: ");
                        String email = view.getScanner().nextLine();
                        System.out.print("CPF: ");
                        String cpf = view.getScanner().nextLine();
                        controller.adicionar(new PessoaFisica(nome, tel, email, cpf));
                    }
                    case 2 -> {
                        System.out.print("Nome: ");
                        String nome = view.getScanner().nextLine();
                        System.out.print("Telefone: ");
                        String tel = view.getScanner().nextLine();
                        System.out.print("Email: ");
                        String email = view.getScanner().nextLine();
                        System.out.print("CNPJ: ");
                        String cnpj = view.getScanner().nextLine();
                        controller.adicionar(new PessoaJuridica(nome, tel, email, cnpj));
                    }
                    case 3 -> view.mostrarContatos(controller.listar());
                    case 4 -> {
                        System.out.print("Informe CPF ou CNPJ do contato a remover: ");
                        String id = view.getScanner().nextLine();
                        controller.remover(id);
                    }
                    case 0 -> executando = false;
                    default -> System.out.println("Opção inválida.");
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
}