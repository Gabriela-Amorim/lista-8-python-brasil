package projetoContaCorrente;

public class ProgramaContaCorrente {
   
      public static void main(String[] args) {
        
        ContaCorrente conta1 = new ContaCorrente(123, "João");
        ContaCorrente conta2 = new ContaCorrente(456, "Maria", 500.0);

        System.out.println("Conta 1 - Número: " + conta1.getNumeroConta() + ", Nome: " + conta1.getNomeCorrentista() + ", Saldo: " + conta1.getSaldo());
        System.out.println("Conta 2 - Número: " + conta2.getNumeroConta() + ", Nome: " + conta2.getNomeCorrentista() + ", Saldo: " + conta2.getSaldo());

        conta1.alterarNome("João Silva");
        conta2.deposito(100.0);
        conta2.saque(200.0);
    }
}
