package Exceptions.Zad_3;

import java.util.Scanner;

public class ExceptionApp {
    public static void main(String[] args) {
        System.out.println("Podaj swoje imie");
        try {
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();

            greet(name);

        } catch (IllegalArgumentException e) {
            System.out.println("Wystąpił błąd " + e.getMessage());

        }

        System.out.println("Zamykam program");
        System.out.println("Zaczynam divided");

        System.out.println(divide(5, 0));
    }

    static void greet(String imie) throws IllegalArgumentException {
        if (imie == null || imie.isEmpty()) {
            throw new IllegalArgumentException("Imie jest puste");
        }
        if (imie.length() == 1) {
            throw new IllegalArgumentException("Imie jest za krótkie");
        }
        System.out.println("Hello " + imie);
    }

    static int divide(int a, int b) {
        if(b==0){
            throw new IllegalArgumentException("Nie dzielimy przez 0");
        }
        return a / b;
    }
}
