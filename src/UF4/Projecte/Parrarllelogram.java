package UF4.Projecte;

public class Parrarllelogram extends Figura {
    private int b;
    private int h;
    public Parrarllelogram(int b,int h){
        b = b;
        h = h;
        setFigura("Parrarllelogram");
    }
    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
    public double CalculArea(){
        b = b * h;
        return b;
    }
}
