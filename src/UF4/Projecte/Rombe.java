package UF4.Projecte;

public class Rombe extends Figura{
    private int dM;
    private int dm;

    public Rombe(int dM,int dm){
        dM = dM;
        dm = dm;
        setFigura("Rombe");
    }
    public int getdM() {
        return dM;
    }

    public void setdM(int dM) {
        this.dM = dM;
    }

    public int getDm() {
        return dm;
    }

    public void setDm(int dm) {
        this.dm = dm;
    }
    public double CalculArea(){
        dm = (dM * dm)/2;
        return dm;
    }
}
