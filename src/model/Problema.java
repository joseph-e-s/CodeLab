package model;

public class Problema {
    private int id;
    private String titulo;
    private String descripcion;
    private String dificultad;

    public Problema(int id, String titulo, String descripcion, String dificultad) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.dificultad = dificultad;
    }

    public int getId() { return id; }
    public String getTitulo() { return titulo; }
    public String getDescripcion() { return descripcion; }
    public String getDificultad() { return dificultad; }

    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public void setDificultad(String dificultad) { this.dificultad = dificultad; }
}
