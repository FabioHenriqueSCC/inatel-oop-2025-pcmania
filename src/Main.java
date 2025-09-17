package src;

import java.util.Scanner;

import src.Cliente.Cliente;
import src.Computador.Computador;
import src.HardwareBasico.HardwareBasico;
import src.MemoriaUSB.MemoriaUSB;
import src.ProcessarPedido.ProcessarPedido;
import src.SistemaOperacional.SistemaOperacional;

// Fábio Henrique de Sousa Carvalho Campos 
// Engenharia de Software
// GESN - 389


public class Main {
    public static void main(String[] args) {
        int escolha;
        Scanner scanner = new Scanner(System.in);

        String nomeAluno = "Fabio Henrique de Sousa Carvalho Campos";
        long matricula = 389;

        Cliente cliente = new Cliente(nomeAluno, "111.222.333-44");

        Computador pc1 = new Computador(
            "Apple",
            matricula, 
            new SistemaOperacional("macOS Sequoia", 64),
            new HardwareBasico[]{
                new HardwareBasico("Pentium Core i3", 2200f),
                new HardwareBasico("Memoria RAM", 8f),
                new HardwareBasico("HD", 500f)
            }
        );
        pc1.addMemoriaUSB(new MemoriaUSB("Pen-drive", 16));

        Computador pc2 = new Computador(
            "Samsung",
            matricula + 1234f, 
            new SistemaOperacional("Windows 8", 64),
            new HardwareBasico[]{
                new HardwareBasico("Pentium Core i5", 3370f),
                new HardwareBasico("Memoria RAM", 16f),
                new HardwareBasico("HD", 1000f)
            }
        );
        pc2.addMemoriaUSB(new MemoriaUSB("Pen-drive", 32));

        Computador pc3 = new Computador(
            "Dell",
            matricula + 5678f, 
            new SistemaOperacional("Windows 10", 64),
            new HardwareBasico[]{
                new HardwareBasico("Pentium Core i7", 4500f),
                new HardwareBasico("Memória RAM", 32f),
                new HardwareBasico("HD", 2000f)
            }
        );
        pc3.addMemoriaUSB(new MemoriaUSB("HD Externo", 1024));

        System.out.println("Qual promoção deseja escolher? (1, 2, 3) ou 0 para sair:");
        do {
            escolha = scanner.nextInt();
            switch (escolha) {
                case 1:
                    cliente.newPC(pc1); 
                    break;
                case 2:
                    cliente.newPC(pc2);
                    break;
                case 3:
                    cliente.newPC(pc3);
                    break;
                case 0:
                    System.out.println("Compras finalizadas!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente!");
                    break;
            }
            if (escolha != 0) {
                System.out.print("Deseja mais alguma promoção? (1, 2, 3) ou 0 para sair: ");
            }
        } while (escolha != 0);

        Computador[] computadoresComprados = cliente.getComputadores();

        if (computadoresComprados.length > 0) {
            System.out.println("TOTAL DA COMPRA: R$ " + String.format("%.2f", cliente.calculaTotalCompra()));           
            ProcessarPedido.processar(computadoresComprados);
        } else {
            System.out.println("\nNenhum computador foi comprado.");
        }

        scanner.close();
    }
}
