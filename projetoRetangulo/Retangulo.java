package projetoRetangulo;

public class Retangulo {

    private double comprimento;
    private double largura;

    public Retangulo() {
    }

    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public void mudarValorLados(double novacomprimento, double novalargura) {
        comprimento = novacomprimento;
        largura = novalargura;
    }

    public String retornarLados() {
        return "comprimento: " + comprimento + "\nlargura: " + largura;
    }

    public double Area() {
        return comprimento * largura;
    }

    public double Perimetro() {
        return 2 * (comprimento * largura);
    }

    public double getcomprimento() {
        return comprimento;
    }

    public void setcomprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getlargura() {
        return largura;
    }

    public void setlargura(double largura) {
        this.largura = largura;
    }

}
