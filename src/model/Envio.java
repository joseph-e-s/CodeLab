package model;

public class Envio {
    private int id;
    private Estudiante estudiante;
    private Problema problema;
    private String resultado;

    public Envio(int id, Estudiante estudiante, Problema problema, String resultado) {
        this.id = id;
        this.estudiante = estudiante;
        this.problema = problema;
        this.resultado = resultado;
    }

    public int getId() { return id; }
    public Estudiante getEstudiante() { return estudiante; }
    public Problema getProblema() { return problema; }
    public String getResultado() { return resultado; }

    public void setResultado(String resultado) { this.resultado = resultado; }
}
