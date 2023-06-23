package projetoTV;

public class TV {

    private double canal;
    private int volume;

    public TV() {
        this.canal = 1;
        this.volume = 50;
    }

    public void trocarCanal(double novoCanal) {
        if (novoCanal >= 1 && novoCanal <= 100) {
            this.canal = novoCanal;
            System.out.println("Canal alterado para: " + novoCanal);
        } else {
            System.out.println("Canal inválido!");
        }
    }

    public void aumentarVolume() {
        if (volume < 100) {
            this.volume++;
            System.out.println("Volume aumentado para: " + volume);
        } else {
            System.out.println("Volume máximo atingido!");
        }
    }

    public void diminuirVolume() {
        if (volume > 0) {
            this.volume--;
            System.out.println("Volume diminuído para: " + volume);
        } else {
            System.out.println("Volume mínimo atingido!");
        }
    }

    public double getCanal() {
        return canal;
    }

    public void setCanal(double canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

}
