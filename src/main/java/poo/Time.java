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
        verificaHora(h, 0 , 0);
    }

    public Time(int h, int m){      //construtor caso seja fornecido apenas minuto
        this.seg = 00;
        verificaHora(h, m, 0);
    }

    public Time(int h, int m, int s){   // construtor com todos componente da hora fornecidos
        verificaHora(h, m, s);
    }
    //------------------------------------------------------------------------------------------------------------------

    private void verificaHora(int h,int m,int s){       // classe responsável por estabelecer as condições necessarias
        if (h >= 0  && h < 25 ){                       // para as ntradas serem consideradas um horário, e caso não
            this.hora = h;                            // atenda os requisitos toma os devidos tratamentos
        }else this.hora = 00;

        if(m >= 0  && m < 60){
            this.min = m;
        }else this.min = 00;

        if(s >= 0  && s < 60){
            this.seg = s;
        }else this.seg = 00;
    }





    //------------------------------------------------------------------------------------------------------------------

    //Retorna a hora como String
    public String toString(){
        String horario = String.valueOf(this.hora) + ":" + String.valueOf(this.min) + ":" + String.valueOf(this.seg);
        return horario;
    }
    //------------------------------------------------------------------------------------------------------------------
    //Altera apenas a hora caso atenda os requisitos necessários
    public boolean alteraHora(int novaHora){
        if(novaHora >= 0  && novaHora < 60){
            this.hora = novaHora;
            return true;
        }
        return false;
    }
    //Altera apenas o minuto caso atenda os requisitos necessários
    public boolean alteraMinuto(int novoMinuto){
        if(novoMinuto >= 0  && novoMinuto < 60){
            this.min = novoMinuto;
            return true;
        }
        return false;
    }
    //Altera apenas o horário caso atenda os requisitos necessários
    public boolean alteraSegundos(int novoSegundo){
        if(novoSegundo >= 0  && novoSegundo < 60){
            this.hora = novoSegundo;
            return true;
        }
        return false;
    }

    //------------------------------------------------------------------------------------------------------------------
    // Método retorna horário em segundos

    public long tempoEmSegundos(){
        return Long.valueOf(this.hora*3600 + this.min*60+this.seg);
    }

    //------------------------------------------------------------------------------------------------------------------
    //Método diminui horário que vem por parâmetro pelo horario da classe, retorna a diferença em segundos
    public long diferenca(Time outroHorario){
        return tempoEmSegundos() - Long.valueOf(outroHorario.hora*3600+outroHorario.min*60+outroHorario.seg);

    }
}
