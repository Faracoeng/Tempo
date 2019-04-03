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

        Time relogio = new Time(hora, minutos, segundos );
        String str = relogio.toString();
        System.out.println(str);
//        if (hora >= 0  && hora <= 60 ){
//
//        }else hora = 00;
//
//        if(minutos >= 0  && minutos <= 60){
//
//        }else minutos = 00;
//
//        if(segundos >= 0  && segundos <= 60){
//
//        }else segundos = 00;
//        System.out.println(hora+":"+minutos+":"+segundos);
    }
}
