package UF2.CalculaMitjana;

import java.util.Scanner;

public class CalculaMitjana {

    private double[] notas = new double[5];


    public static void main(String[] args) {
        CalculaMitjana programa = new CalculaMitjana();
        programa.inici();
    }
    public void inici(){
        Mostrarmenu();
        llegirDades();
        double max = calculaMax();
        double min =calculaMin();
        double mitj = calculaMitj();
        imprimir();
    }

    public void imprimir(){
        System.out.println("la minima es "  + calculaMin());
        System.out.println("la maxima es " + calculaMax());
        System.out.println("la mediana es "  + calculaMitj());
    }

    public double calculaMitj() {
        double mitj = 0;
        double total = 0;
        for (int i = 1; i < notas.length; i++){
            total = notas[i] + total;
        }
        mitj = total / notas.length;
        return mitj;
    }

    public double calculaMin() {
        double min= notas[0];
        for(int i = 1; i < notas.length; i++) {
            if (notas[i] < min) {
                min = notas[i];
            }
        }
        return min;
    }

    public double calculaMax() {
        double max = notas[0];
        for(int i = 1; i < notas.length; i++){
            if (notas[i] > max){
                max = notas[i];
            }
        }
        return max;
    }

    public void llegirDades() {
        Scanner lector = new Scanner(System.in);
        for(int i = 0; i < notas.length; i++){
            notas[i] = lector.nextDouble();
        }

    }


    public void Mostrarmenu() {
        System.out.println ("Pon 5 numeros.");
    }


}


