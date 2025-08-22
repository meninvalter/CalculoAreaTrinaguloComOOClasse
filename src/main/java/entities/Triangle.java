package entities;

public class Triangle{
    //ATRIBUTOS
    public double ladoA;
    public double ladoB;
    public double ladoC;

    //MÉTODOS (FUNÇÕES)
    public double area (){
        double p =(ladoA+ladoB+ladoC)/2.0;
        return Math.sqrt(p*(p-ladoA)-(p-ladoB)-(p-ladoC));
    }

}