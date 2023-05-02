package UF2.ParamEntrada;

import UF2.ParamEntrada.EscriureEstrelles;

public class EscriureEstrelles {

    public static void main (String[] args) {
        EscriureEstrelles programa = new EscriureEstrelles();
        programa.inici();
    }

    private void inici() {
        estrellar(4);
        estrellar(10);
        estrellar(20);
        estrellar(10);
        estrellar(20);
        estrellar(10);
        estrellar(20);
        estrellar(10);
        estrellar(20);
        estrellar(10);
        estrellar(20);
    }

    public void estrellar(int a){
        for (int i = 0; i < a; i++){
            System.out.print("*");
        }
        System.out.println("");
    }

}
