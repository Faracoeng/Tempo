package poo;


import org.junit.Test;
import org.junit.Assert;

public class testaTempo {
    @Test
    public void testarHorario(){
        Time relogioTeste = new Time(60,60,60);
        Assert.assertEquals("60:60:60 Não é um horário", "0:0:0",relogioTeste.toString());


    }

}
