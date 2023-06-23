package projetoFuncionarioAprimorado;

import projetoFuncionario.Funcionario;

public class ProgramaFuncionarioAprimorado {
    

        public static void main(String[] args) {
            
            Funcionario harry = new Funcionario("Harry", 25000.0);
            System.out.println("Salário inicial do funcionário: R$" + harry.getSalario());

            harry.aumentarSalario(10);
            System.out.println("Salário após aumento: R$" + harry.getSalario());
        }
    }

