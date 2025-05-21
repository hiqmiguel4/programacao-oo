/**
 * Classe principal que executa o sistema de folha de pagamento.
 */
public class ProgramaFolha {
    public static void main(String[] args) {
        Funcionario f1 = new FuncionarioCLT("Carlos", 2000.0);
        Funcionario f2 = new FuncionarioTemporario("Ana", 2000.0);

        f1.exibirDados();
        System.out.println("Salário Final: " + f1.calcularSalario());
        System.out.println();

        f2.exibirDados();
        System.out.println("Salário Final: " + f2.calcularSalario());
    }
}