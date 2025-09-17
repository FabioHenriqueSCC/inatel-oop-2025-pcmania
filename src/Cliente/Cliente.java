package src.Cliente;

import src.Computador.Computador;

public class Cliente {
    private String nome; 
    private String cpf; 
    private Computador[] computadores;
    private int computadorCount = 0;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.computadores = new Computador[10];
    }

    public void addComputador(Computador computador) {
        if (computadorCount < computadores.length) {
            computadores[computadorCount] = computador;
            computadorCount++;
        }
    }

    public float calculaTotalCompra() {
        float total = 0;
        for (int i = 0; i < computadorCount; i++) {
            total += computadores[i].getPreco();
        }
        return total;
    }

     public Computador[] getComputadores() {
        Computador[] comprados = new Computador[computadorCount];

        for (int i = 0; i < computadorCount; i++) {
            comprados[i] = this.computadores[i];
        }

        return comprados;
    }

    public void newPC(Computador computador) {
        if (computadorCount < computadores.length) {
            computadores[computadorCount] = computador;
            computadorCount++;
        }
    }
}