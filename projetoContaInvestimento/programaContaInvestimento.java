package projetoContaInvestimento;

public class programaContaInvestimento {

    

        public static void main(String[] args) {

            ContaInvestimento poupanca = new ContaInvestimento(1000.00, 10.0);
            for (int i = 0; i < 5; i++) {
                poupanca.adicioneJuros();
            }
            System.out.println("Saldo final: R$" + poupanca.getSaldo());
        }
    }


