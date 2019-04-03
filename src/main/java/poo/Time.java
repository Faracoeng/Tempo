package poo;

/**
 * Classe responsável por montar, estruturar e manipular o horário inserido
 *
 * @author andre
 */

public class Time {
    private int hora;       //atributo associado a hora insrida
    private int min;        // atributo assiciado ao minutos inserido
    private int seg;        // atributo associado ao segundo associado

    public Time(int h){     //construtor caso seja fornecido apenas hora
        this.hora = h;
        this.min = 00;
        this.seg = 00;

    }

    public Time(int h, int m){      //construtor caso seja fornecido apenas minuto
        this.hora = h;
        this.min = m;
        this.seg = 00;

    }

    public Time(int h, int m, int s){   // construtor com todos componente da hora fornecidos
        this.hora = h;
        this.min = m;
        this.seg = s;

    }

    //Retorna a hora como String
    public String toString(){
        String horario = String.valueOf(hora) + ":" + String.valueOf(min) + ":" + String.valueOf(seg);
        return horario;
    }

    public boolean alteraHora(int novaHora){

    }
}
