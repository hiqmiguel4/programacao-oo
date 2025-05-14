/**
 * Conta corrente que aplica 0.1% de juros ao dia.
 */
public class ContaCorrente extends Conta {

    public ContaCorrente(String cliente, double saldo) {
        super(cliente, saldo);
    }

    @Override
    public void aplicarJurosDiarios() {
        saldo *= 1.001;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirExtrato();
    }
}