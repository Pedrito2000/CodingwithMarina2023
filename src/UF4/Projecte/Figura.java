package UF4.Projecte;

import java.util.UUID;

public class Figura {

    private String figura;
    public static int id;

    public Figura(){
        id++;
    }

    public String getFigura() {
        return figura;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void ImprimirDades(){
        CalculArea();
        System.out.println("la figura con el id " +getId() + " es un " + getFigura());
        System.out.println("el area del " + getFigura() + " es " +CalculArea());

    }
    public double CalculArea(){
        return 0;}
}
