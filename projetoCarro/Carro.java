package projetoCarro;

public class Carro {

    private double consumo;
    private double combustivel;

    public Carro(double consumo) {
        this.consumo = consumo;
        this.combustivel = 0;
    }

    public void adicionarGasolina(double quantidade) {
        combustivel += quantidade;
    }

    public void andar(double distancia) {
        double consumoCombustivel = distancia / consumo;
        if (consumoCombustivel <= combustivel) {
            combustivel -= consumoCombustivel;
            System.out.println("O carro percorreu " + distancia + " km.");
        } else {
            System.out.println("Combustível insuficiente para percorrer essa distância.");
        }

    }

    public double obterGasolina() {
        return combustivel;
    }

    public double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }
}