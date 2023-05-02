package UF4.Projecte;

public class Cercle extends Figura{
    private int radi;

    public Cercle(){

    }
    public Cercle(int r){
        radi = r;
        setFigura("Cercle");
    }
    public int getRadi() {
        return radi;
    }

    public void setRadi(int radi) {
        this.radi = radi;
    }
    public double CalculArea(){
        radi = (int) (Math.pow(radi, 2) * Math.PI);
        return radi;
    }
}


