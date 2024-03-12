package org.example;

import java.util.Scanner;

public class Q5 {
/*
5) Escreva um programa que inverta os caracteres de um string.

IMPORTANTE:
a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
b) Evite usar funções prontas, como, por exemplo, reverse;
 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();

        String invertedString = inverterString(input);

        System.out.println("A string invertida é: " + invertedString);

        scanner.close();
    }
    public static String inverterString(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        char[] charArray = input.toCharArray();

        int i = 0;
        int j = charArray.length - 1;
        while (i < j) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            i++;
            j--;
        }
        return new String(charArray);
    }
}
