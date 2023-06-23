package projetoTamagushi;

public class Tamagushi {

    private String nome;
    private int fome;
    private int saude;
    private int idade;

    public Tamagushi(String nome, int fome, int saude, int idade) {
        this.nome = nome;
        this.fome = fome;
        this.saude = saude;
        this.idade = idade;
    }

    public void alterarNome(String novoNome) {
        this.nome = novoNome;
    }

    public void alterarFome(int novaFome) {
        this.fome = novaFome;
    }

    public void alterarSaude(int novaSaude) {
        this.saude = novaSaude;
    }

    public void alterarIdade(int novaIdade) {
        this.idade = novaIdade;
    }

    public String retornarNome() {
        return nome;
    }

    public int retornarFome() {
        return fome;
    }

    public int retornarSaude() {
        return saude;
    }

    public int retornarIdade() {
        return idade;
    }

    public String retornarHumor() {
        if (fome <= 50 && saude >= 50) {
            return "Feliz";
        } else if (fome > 50 && saude >= 50) {
            return "Com Fome";
        } else if (fome <= 50 && saude < 50) {
            return "Doente";
        } else {
            return "Com Fome e Doente";
        }
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
        return null;
    }

    public void alimentar(int i) {
    }

    public void brincar(int i) {
    }
}
