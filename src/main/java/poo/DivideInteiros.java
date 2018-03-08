package poo;

public class DivideInteiros {
    /**
     * faz divisao de inteiros
     * @param a primeiro numero
     * @param b segundo numero
     * @return
     */
    public double divide(int a, int b){
        if(b==0) {
            return 0;
        }else{
            return (double)(a/b);
        }
    }
}
