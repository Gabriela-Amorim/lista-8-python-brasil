package projetoQuadrado;
public class Quadrado {

    private double tamanhoLado;
    private double base;
    private double altura;

    public void mudarTamanhoLado(double novoTamanhoLado) {
        tamanhoLado = novoTamanhoLado;
    }

    public String mostrarTamanhoLado() {
        return "O valor do lado é: " + tamanhoLado;
    }

    public double calcularArea() {
        return base * altura;
    }

    public double getTamanhoLado() {
        return tamanhoLado;
    }

    public void setTamanhoLado(double tamanhoLado) {
        this.tamanhoLado = tamanhoLado;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
