package UF4.Projecte;

public class Quadrat extends Figura{
    private int costat;
    public Quadrat (int r){
        costat = r;
        setFigura("Quadrat");
    }
    public int getCostat() {
        return costat;
    }

    public void setCostat(int costat) {
        this.costat = costat;
    }
    public double CalculArea(){
        costat = (int) Math.pow(costat, 2);
        return costat;
    }
}
