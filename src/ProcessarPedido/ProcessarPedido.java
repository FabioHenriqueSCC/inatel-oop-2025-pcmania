package src.ProcessarPedido;

import src.Computador.Computador;

public class ProcessarPedido {
    
    public static void processar(Computador[] computadores) {
        if (computadores != null && computadores.length > 0) {
             System.out.println("Pedido enviado...");
        }
    }
}
