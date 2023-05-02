package UF4.Projecte;

public class rectangle extends Figura{
    private int costat1;
    private int costat2;
    public rectangle (int c1, int c2){
        costat1 = c1;
        costat2 = c2;
        setFigura("rectangle");
    }
    public int getCostat1() {
        return costat1;
    }

    public void setCostat1(int costat1) {
        this.costat1 = costat1;
    }

    public int getCostat2() {
        return costat2;
    }

    public void setCostat2(int costat2) {
        this.costat2 = costat2;
    }
    public double CalculArea(){
        costat2 = costat1 * costat2;
        return costat2;
    }
}
