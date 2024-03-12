package org.example;

import java.util.Scanner;

public class Q3 {
/*
    3) Descubra a lógica e complete o próximo elemento:
    a) 1, 3, 5, 7, ___

    b) 2, 4, 8, 16, 32, 64, ____

    c) 0, 1, 4, 9, 16, 25, 36, ____

    d) 4, 16, 36, 64, ____

    e) 1, 1, 2, 3, 5, 8, ____

    f) 2,10, 12, 16, 17, 18, 19, ____
 */
    public static void main(String[] args) {
        int proximoA = proximoElementoA(7);
        System.out.println("Sequência a): O próximo elemento é: " + proximoA);
        int proximoB = proximoElementoB(64);
        System.out.println("Sequência b): O próximo elemento é: " + proximoB);
        int proximoC = proximoElementoC(36);
        System.out.println("Sequência c): O próximo elemento é: " + proximoC);
        int proximoD = proximoElementoD(64);
        System.out.println("Sequência d): O próximo elemento é: " + proximoD);
        int proximoE = proximoElementoE(8);
        System.out.println("Sequência e): O próximo elemento é: " + proximoE);
        int proximoF = proximoElementoF(19);
        System.out.println("Sequência f): O próximo elemento é: " + proximoF);
    }
    public static int proximoElementoA(int ultimo) {
        return ultimo + 2;
    }
    public static int proximoElementoB(int ultimo) {
        return ultimo * 2;
    }
    public static int proximoElementoC(int ultimo) {
        int raiz = (int) Math.sqrt(ultimo);
        return (raiz + 1) * (raiz + 1);
    }
    public static int proximoElementoD(int ultimo) {
        return (int) Math.pow(Math.sqrt(ultimo) + 2, 2);
    }
    public static int proximoElementoE(int ultimo) {
        int penultimo = 5;
        return ultimo + penultimo;
    }
    public static int proximoElementoF(int ultimo) {
        if (ultimo == 16) {
            return 17;
        } else if (ultimo == 17) {
            return 18;
        } else {
            return ultimo + 1;
        }
    }
}
