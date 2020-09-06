package academy.learnprogramming;

public class Consumidor {

    private String nome;
    private int telefone; //TELEFONE
    private int[] fiados;
    private int fiadosPosicao = 0;

    public Consumidor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int[] getFiados() {
        return fiados;
    }

    public void setFiados(int[] fiados) {
        this.fiados = fiados;
    }

    public int getFiadosPosicao() {
        return fiadosPosicao;
    }

    public void setFiadosPosicao(int fiadosPosicao) {
        this.fiadosPosicao = fiadosPosicao;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}
