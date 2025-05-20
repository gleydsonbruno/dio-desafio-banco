public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Pandeiro");
        Conta contaCliente = new ContaCorrente(cliente);
        contaCliente.depositar(500);
        contaCliente.imprimirExtrato();
    }
}