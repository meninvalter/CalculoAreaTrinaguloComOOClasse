import entities.Triangle;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x,y;
        x = new Triangle();
        y = new Triangle();


        System.out.println("Enter the measures of triangle x: ");
        x.ladoA = sc.nextDouble();
        x.ladoB = sc.nextDouble();
        x.ladoC = sc.nextDouble();

        System.out.println("Enter the measures of triangle y: ");
        y.ladoA = sc.nextDouble();
        y.ladoB = sc.nextDouble();
        y.ladoC = sc.nextDouble();

        //CALCULAR A ÁREA DO TRINGULO
        double p =(x.ladoA+x.ladoB+x.ladoC)/2.0;
        double areaX = Math.sqrt(p*(p-x.ladoA)-(p-x.ladoB)-(p-x.ladoC));

        p =(y.ladoA+y.ladoB+y.ladoC)/2.0;
        double areaY = Math.sqrt(p*(p-y.ladoA)-(p-y.ladoB)-(p-y.ladoC));

        System.out.printf("Triangle X area: %.4f%n",areaX);
        System.out.printf("Triangle Y area: %.4f%n",areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        }
        else {
            System.out.println("Larger area: Y");
        }

    }
}
