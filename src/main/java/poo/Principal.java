package poo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira a hora: ");
        int hora = teclado.nextInt();
        System.out.println("Insira o minuto: ");
        int minutos = teclado.nextInt();
        System.out.println("Insira os segundos: ");
        int segundos = teclado.nextInt();

        Time relogio = new Time(hora);
        String str = relogio.toString();
        System.out.println(str);

    }
}
