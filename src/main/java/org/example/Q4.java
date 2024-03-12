package org.example;

import java.util.Scanner;

public class Q4 {
/*
4) Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em uma sala diferente. Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os
interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada.

Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada?

RESPOSTA:
Eu ligaria um interruptor e espere alguns minutos. Desligaria o interruptor e ligaria outro interruptor. Iria até a sala onde as lâmpadas estão localizadas. Assim, temos três situações possíveis:
    1- Se a lâmpada estiver acesa, então o interruptor que ligamos inicialmente está conectado a essa lâmpada.
    2- Se a lâmpada estiver apagada e sentirmos calor, o interruptor que ligamos inicialmente está conectado a essa lâmpada.
    3- Se a lâmpada estiver apagada e a lâmpada estiver fria, o interruptor que não tocamos está conectado a essa lâmpada.
 */

// SIMULAÇÃO EM CÓDIGO
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Você está na sala com os interruptores.");
        System.out.println("Pressione 1 para ligar o interruptor 1, 2 para ligar o interruptor 2 e 3 para ligar o interruptor 3.");

        System.out.print("Escolha o primeiro interruptor a ser ligado: ");
        int primeiroInterruptor = scanner.nextInt();

        System.out.println("Aguarde alguns minutos...");

        int segundoInterruptor = 0;
        do {
            System.out.print("Escolha o segundo interruptor a ser ligado (diferente do primeiro): ");
            segundoInterruptor = scanner.nextInt();
        } while (segundoInterruptor == primeiroInterruptor);

        System.out.println("Aguarde mais alguns minutos...");

        int terceiroInterruptor = 6 - (primeiroInterruptor + segundoInterruptor);
        System.out.println("Você está na sala das lâmpadas.");

        System.out.println("Verifique o estado das lâmpadas e sinta a temperatura.");

        if (verificarLampadaAcesa()) {
            System.out.println("O interruptor " + primeiroInterruptor + " controla a lâmpada que está acesa.");
        } else if (verificarCalorLampada()) {
            System.out.println("O interruptor " + segundoInterruptor + " controla a lâmpada que está quente.");
        } else {
            System.out.println("O interruptor " + terceiroInterruptor + " controla a lâmpada que está fria.");
        }

        scanner.close();
    }
    public static boolean verificarLampadaAcesa() {
        return true;
    }

    public static boolean verificarCalorLampada() {
        return true;
    }
}
