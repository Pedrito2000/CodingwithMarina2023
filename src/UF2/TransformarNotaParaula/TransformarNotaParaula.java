package UF2.TransformarNotaParaula;


import java.util.Scanner;

public class TransformarNotaParaula {

    private double nota = 0;
    private String palabra = "";

    public static void main(String[] args) {
        TransformarNotaParaula programa = new TransformarNotaParaula();
        programa.inici();
    }

    public void inici(){
        MostrarMenu();
        LeerDatos();
        TransformarParaula();
        Imprimir();
    }

    public void MostrarMenu() {
        System.out.println("Pon una nota");
    }

    public void LeerDatos() {
        Scanner lector = new Scanner(System.in);
        nota = lector.nextDouble();
    }

    public void TransformarParaula() {
        if (nota >=9 && nota <=10){
            palabra = "Excelente";
        }

        else if (nota >= 6.5 && nota <= 8.9){
            palabra = "Notable";
        }

        else if (nota >= 5 && nota <= 6.49) {
            palabra = "Aprobado";
        }

        else if (nota >= 0 && nota <= 4.99) {
            palabra = "Suspendido";
        }


    }

    public void Imprimir() {
        if(nota >= 0 && nota <= 10) {
            System.out.println("tu nota es " + nota + " y se queda en un " + palabra);
        }
        else {
            System.out.println("Nota no valida");
        }
    }


}
           
       

