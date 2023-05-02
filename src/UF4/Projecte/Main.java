package UF4.Projecte;

import java.awt.*;

public class Main {
    public static void main (String [] args){
        Triangle T1 = new Triangle(8,9);
        T1.ImprimirDades();

        Quadrat Q1 = new Quadrat(10);
        Q1.ImprimirDades();

        rectangle R1 = new rectangle(8,6);
        R1.ImprimirDades();

        Trapezi T2 = new Trapezi(2,4,6);
        T2.ImprimirDades();

        Rombe R2 = new Rombe(12,5);
        R2.ImprimirDades();

        Parrarllelogram P1 = new Parrarllelogram(7,9);
        P1.ImprimirDades();

        Cercle C1 = new Cercle(8);
        C1.ImprimirDades();
    }
}
