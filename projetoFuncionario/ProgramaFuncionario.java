package projetoFuncionario;

public class ProgramaFuncionario {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("João", 2000.00);
        
        System.out.println("Nome do funcionário: " + funcionario.getNome());
        System.out.println("Salário do funcionário: R$" + funcionario.getSalario());
    }
}
