package projetoTamagushiPortaEscondida;

public class PortaEscondida {

    private int fome;
    private int tedio;

    public void Bichinho() {
        this.fome = 0;
        this.tedio = 0;
    }

    public void alimentar() {
        fome -= 10;
        if (fome < 0) {
            fome = 0;
        }
        System.out.println("Bichinho alimentado!");
    }

    public void brincar() {
        tedio -= 10;
        if (tedio < 0) {
            tedio = 0;
        }
        System.out.println("Bichinho brincou!");
    }

    public void emitirSom() {
        System.out.println("O Bichinho está emitindo um som!");
    }

    @Override
    public String toString() {
        return "Estado do Bichinho - Fome: " + fome + ", Tédio: " + tedio;
    }

    public String toStringDetalhado() {
        return "Detalhes do Bichinho - Fome: " + fome + ", Tédio: " + tedio;
    }
}    

