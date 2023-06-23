package projetoBola;
public class Bola {

    private String cor;
    private double circunferencia;
    private String material;

    public void trocaCor(String novaCor) {
        cor = novaCor;
    }

    public String mostraCor() {
        return "A cor da bola é: " + cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getCircunferencia() {
        return circunferencia;
    }

    public void setCircunferencia(double circunferencia) {
        this.circunferencia = circunferencia;
    }

    public String getMaterial(){
        return material;
    }

    public void setMaterial(String material){
        this.material = material;
    }

} 


