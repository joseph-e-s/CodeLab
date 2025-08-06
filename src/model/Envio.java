package model;

public class Envio {

    // Identificador único del envío
    private int id;

    // Estudiante que realizó el envío
    private Estudiante estudiante;

    // Problema que el estudiante intentó resolver
    private Problema problema;

    // Resultado del envío (por ejemplo: "Aceptado", "Error", "Tiempo excedido")
    private String resultado;

    // Constructor: crea un envío con su id, estudiante, problema y resultado
    public Envio(int id, Estudiante estudiante, Problema problema, String resultado) {
        this.id = id;                 // Guarda el id
        this.estudiante = estudiante; // Guarda el estudiante
        this.problema = problema;     // Guarda el problema
        this.resultado = resultado;   // Guarda el resultado
    }

    // Obtiene el id del envío
    public int getId() { 
        return id; 
    }

    // Obtiene el estudiante que hizo el envío
    public Estudiante getEstudiante() { 
        return estudiante; 
    }

    // Obtiene el problema del envío
    public Problema getProblema() { 
        return problema; 
    }

    // Obtiene el resultado del envío
    public String getResultado() { 
        return resultado; 
    }

    // Cambia el resultado del envío
    public void setResultado(String resultado) { 
        this.resultado = resultado; 
    }
}
