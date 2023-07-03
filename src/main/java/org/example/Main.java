package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();

        System.out.println("Ingrese el primer número:");
        int num1 = scanner.nextInt();
        lista.add(num1);

        System.out.println("Ingrese el segundo número:");
        int num2 = scanner.nextInt();
        lista.add(num2);

        System.out.println("Ingrese el tercer número:");
        int num3 = scanner.nextInt();
        lista.add(num3);

        System.out.println("Lista desordenada: " + lista);

        while (!isSorted(lista)) {
            Collections.shuffle(lista);
        }

        System.out.println("Lista ordenada: " + lista);
    }

    private static boolean isSorted(List<Integer> lista) {
        for (int i = 0; i < lista.size() - 1; i++) {
            if (lista.get(i) > lista.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

}