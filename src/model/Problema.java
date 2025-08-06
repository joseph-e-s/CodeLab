package model;

public class Problema {

    // Identificador único del problema
    private int id;

    // Título del problema
    private String titulo;

    // Descripción detallada del problema
    private String descripcion;

    // Nivel de dificultad del problema (por ejemplo: Fácil, Medio, Difícil)
    private String dificultad;

    // Constructor: crea un problema con id, título, descripción y dificultad
    public Problema(int id, String titulo, String descripcion, String dificultad) {
        this.id = id;                     // Guarda el id
        this.titulo = titulo;             // Guarda el título
        this.descripcion = descripcion;   // Guarda la descripción
        this.dificultad = dificultad;     // Guarda la dificultad
    }

    // Obtiene el id del problema
    public int getId() { 
        return id; 
    }

    // Obtiene el título del problema
    public String getTitulo() { 
        return titulo; 
    }

    // Obtiene la descripción del problema
    public String getDescripcion() { 
        return descripcion; 
    }

    // Obtiene la dificultad del problema
    public String getDificultad() { 
        return dificultad; 
    }

    // Cambia el título del problema
    public void setTitulo(String titulo) { 
        this.titulo = titulo; 
    }

    // Cambia la descripción del problema
    public void setDescripcion(String descripcion) { 
        this.descripcion = descripcion; 
    }

    // Cambia la dificultad del problema
    public void setDificultad(String dificultad) { 
        this.dificultad = dificultad; 
    }
}
