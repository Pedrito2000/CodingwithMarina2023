package UF4.Projecte;

public class Triangle extends Figura {
    private int base;
    private int h;
    public Triangle(int b,int a){
        base = b;
        h = a;
        setFigura("Triangle");
    }
    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public int getH() {
        return h;
    }
    public void setH(int h) {
        this.h = h;
    }


    public double CalculArea() {
        return (base*h)/2;
    }
}
