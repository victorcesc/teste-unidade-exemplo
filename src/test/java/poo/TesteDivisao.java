package poo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TesteDivisao {

    @Parameterized.Parameters(name = "{index}: Divisao({1},{1}) = {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 1000, 2, 500 },
                { 500, 1000, 0.5 },
                { 3, 3, 1 },
                { 10, 5, 2 },
                {500, 0, 0 }


        });
    }

    @Parameterized.Parameter(0)
    public int operandoUm;

    @Parameterized.Parameter(1)
    public int operandoDois;

    @Parameterized.Parameter(2)
    public double resultado;

    @Test
    public void teste(){
        DivideInteiros obj = new DivideInteiros();
        assertEquals(resultado,obj.divide(operandoUm,operandoDois),4);
    }
}
