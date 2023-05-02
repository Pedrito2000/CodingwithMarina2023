package UF4.HerenciaSimple;

public class Estudiante extends Persona {
    private String curs;
    private String assignaturas;
    private String escuela;
    private double nota;

    public String getCurs() {
        return curs;
    }

    public void setCurs(String curs) {
        this.curs = curs;
    }

    public String getAssignaturas() {
        return assignaturas;
    }

    public void setAssignaturas(String assignaturas) {
        this.assignaturas = assignaturas;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
