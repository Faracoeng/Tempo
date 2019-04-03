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
    private boolean flag;

    public Time(int h){     //construtor caso seja fornecido apenas hora

        this.min = 00;
        this.seg = 00;
        if (h >= 0  && h < 60 ){
            this.hora = h;
        }else this.hora = 00;
    }

    public Time(int h, int m){      //construtor caso seja fornecido apenas minuto
        this.seg = 00;
        if(m >= 0  && m < 60){
            this.min = m;
        }else this.min = 00;
    }

    public Time(int h, int m, int s){   // construtor com todos componente da hora fornecidos
        if (h >= 0  && h < 60 ){
            this.hora = h;
        }else this.hora = 00;

        if(m >= 0  && m < 60){
            this.min = m;
        }else this.min = 00;

        if(s >= 0  && s < 60){
            this.seg = s;
        }else this.seg = 00;

    }
    //----------------------------------------------------------------------------------------------------------------

//    private void verificaHora(int h,int m,int s){
//        if (h >= 0  && h <= 60 ){
//            this.hora = h;
//        }else this.hora = 00;
//
//        if(m >= 0  && m <= 60){
//            this.min = m;
//        }else this.min = 00;
//
//        if(s >= 0  && s <= 60){
//            this.seg = s;
//        }else this.seg = 00;
//    }





    //----------------------------------------------------------------------------------------------------------------

    //Retorna a hora como String
    public String toString(){
        String horario = String.valueOf(this.hora) + ":" + String.valueOf(this.min) + ":" + String.valueOf(this.seg);
        return horario;
    }

    public boolean alteraHora(int novaHora){
        return true;
    }
}
