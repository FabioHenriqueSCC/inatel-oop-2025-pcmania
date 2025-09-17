package src.Computador;

import src.HardwareBasico.HardwareBasico;
import src.MemoriaUSB.MemoriaUSB;
import src.SistemaOperacional.SistemaOperacional;

public class Computador {
    private String marca; 
    private float preco; 
    private SistemaOperacional sistemaOperacional;
    private HardwareBasico[] hardwareBasico;
    private MemoriaUSB memoriaUSB;

    public Computador(String marca, float preco, SistemaOperacional so, HardwareBasico[] hb) {
        this.marca = marca;
        this.preco = preco;
        this.sistemaOperacional = so;
        this.hardwareBasico = hb;
    }

    public void mostraPCConfigs() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$ " + String.format("%.2f", preco));
        
        for (HardwareBasico hb : hardwareBasico) {
            System.out.println(hb.getNome() + " (" + hb.getCapacidade() + (hb.getNome().contains("Core") ? " Mhz)" : " Gb)"));
        }
        
        System.out.println("Sistema Operacional: " + sistemaOperacional.getNome() + " (" + sistemaOperacional.getTipo() + " bits)");
        
        if (memoriaUSB != null) {
            System.out.println("Acompanha: " + memoriaUSB.getNome() + " de " + memoriaUSB.getCapacidade() + "Gb");
        }
    }

    public void addMemoriaUSB(MemoriaUSB musb) {
        this.memoriaUSB = musb;
    }
}
