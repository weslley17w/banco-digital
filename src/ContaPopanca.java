public class ContaPopanca extends Conta{

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupanca ===");
        super.ImprimirInfosComuns();
    }
}
