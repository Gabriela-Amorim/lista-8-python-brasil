package projetoFazenda.entities;

public class Fazenda {

    private String nomeAnimal;
    private int fome;
    private int tedio;

    public Fazenda() {
    }

    public Fazenda(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
        this.fome = (int) ((Math.random() * 10) + 1);
        this.tedio = (int) ((Math.random() * 10) + 1);
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public int getFome() {
        return fome;
    }

    public void setFome(int fome) {
        this.fome = fome;
    }

    public int getTedio() {
        return tedio;
    }

    public void setTedio(int tedio) {
        this.tedio = tedio;
    }

    public void alimentar() {
        if (fome >= 2) {
            fome -= 2;
        }
    }

    public void brincar() {
        if (tedio >= 2) {
            tedio -= 2;
        }
    }

    public void ouvir() {
        if (tedio >= 1) {
            tedio--;
        }
    }

    @Override
    public String toString() {
        return "\n\n" + nomeAnimal
                + "\nFome: " + fome
                + "\nTédio: " + tedio;
    }

}
