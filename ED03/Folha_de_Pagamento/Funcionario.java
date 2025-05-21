/**
 * Classe abstrata que representa um funcionário genérico.
 */
public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário Base: " + salarioBase);
    }

    public abstract double calcularSalario();
}