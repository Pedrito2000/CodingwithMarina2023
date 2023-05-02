package UF2.CalculArees;

import java.util.Scanner;

public class CalculArees {

    private String figura = "";

    private double area = 0;

    public static void main(String[] args) {
        CalculArees programa = new CalculArees();
        programa.inici();
    }


    public void inici() {
        menu();
        leerFigura();
        CalculaArea();
        Imprimir();
    }

    public void Imprimir() {
        System.out.println("L'area del " + figura + " es " + area);
    }

    public void CalculaArea() {
        if (figura.equalsIgnoreCase("Triangle")) {
            double b = 23.0;
            double h = 8.0;
            area = (b*h)/2;
        }

        else if (figura.equalsIgnoreCase("Quadrat")) {
            double r = 37.0;

            area = Math.pow(r, 2);
        }

        else if (figura.equalsIgnoreCase("rectangle")) {
            double a = 68.0;
            double b = 39.0;

            area = a * b;

        }

        else if (figura.equalsIgnoreCase("trapezi")) {
            double a = 35.0;
            double b = 16.0;
            double h = 5.0;

            area = ((a * b)*h)/2;
        }

        else if (figura.equalsIgnoreCase("rombe")) {
            double dM = 75.0;
            double dm = 30.0;

            area = (dM * dm)/2;
        }

        else if (figura.equalsIgnoreCase("paralelogram")) {
            double b = 45.0;
            double h = 13.0;

            area = b * h;
        }

        else if (figura.equalsIgnoreCase("cercle")) {
            double r = 0;
            System.out.println("Quin es el radi del cerlce?");
            r = leerRadi();

            area = Math.pow(r, 2) * Math.PI;
        }
    }

    public void leerFigura() {

        Scanner lector = new Scanner(System.in);
        figura = lector.next();
    }

    public double leerRadi() {
        Scanner lector = new Scanner(System.in);
        double r = lector.nextDouble();

        return r;
    }


    public void menu() {

        System.out.println("Tria una figura per calcular arees");
        System.out.println("triangle");
        System.out.println("Quadrat");
        System.out.println("rectangle");
        System.out.println("trapezi");
        System.out.println("rombe");
        System.out.println("paralelogram");
        System.out.println("cercle");


    }
}
