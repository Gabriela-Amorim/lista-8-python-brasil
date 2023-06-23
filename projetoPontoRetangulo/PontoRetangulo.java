package projetoPontoRetangulo;

class Ponto {
    private int x;
    private int y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void imprimir() {
        System.out.println("Ponto (" + x + ", " + y + ")");
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

class Retangulo {
    private Ponto pontoInicial;
    private int largura;
    private int altura;

    public Retangulo(Ponto pontoInicial, int largura, int altura) {
        this.pontoInicial = pontoInicial;
        this.largura = largura;
        this.altura = altura;
    }

    public Ponto encontrarCentro() {
        int centroX = pontoInicial.getX() + largura / 2;
        int centroY = pontoInicial.getY() + altura / 2;
        return new Ponto(centroX, centroY);
    }

    public void alterarValores(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public void imprimirCentro() {
        Ponto centro = encontrarCentro();
        System.out.println("Centro do Retângulo:");
        centro.imprimir();
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public Ponto getPontoInicial() {
        return pontoInicial;
    }

    public void setPontoInicial(Ponto pontoInicial) {
        this.pontoInicial = pontoInicial;
    }
}
