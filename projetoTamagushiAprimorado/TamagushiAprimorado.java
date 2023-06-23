package projetoTamagushiAprimorado;

public class TamagushiAprimorado {
    private String nome;
    private int fome;
    private int saude;
    private int idade;

    public TamagushiAprimorado(String nome, int fome, int saude, int idade) {
        this.nome = nome;
        this.fome = fome;
        this.saude = saude;
        this.idade = idade;
    }

    public void alterarNome(String novoNome) {
        this.nome = novoNome;
    }

    public void alimentar(int quantidadeComida) {
        fome -= quantidadeComida;
        if (fome < 0) {
            fome = 0;
        }
    }

    public void brincar(int tempoBrincadeira) {
        saude += tempoBrincadeira;
        if (saude > 100) {
            saude = 100;
        }
    }

    public void alterarIdade(int novaIdade) {
        this.idade = novaIdade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFome() {
        return fome;
    }

    public void setFome(int fome) {
        this.fome = fome;
    }

    public int getSaude() {
        return saude;
    }

    public void setSaude(int saude) {
        this.saude = saude;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getHumor() {
        if (fome <= 50 && saude >= 50) {
            return "Feliz";
        } else {
            return "Triste";
        }
    }

    public void imprimirEstado() {
    }

    public void passarTempo(int i) {
    }
}