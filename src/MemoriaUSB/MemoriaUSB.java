package src.MemoriaUSB;

public class MemoriaUSB {
    private String nome;
    private int capacidade;

    public MemoriaUSB(String nome, int capacidade){
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public String getNome() {
        return this.nome;
    }

    public int getCapacidade() {
        return this.capacidade;
    }
}
