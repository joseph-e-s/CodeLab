package model;

// La clase Estudiante hereda de Usuario
public class Estudiante extends Usuario {

    // Constructor: crea un estudiante usando el constructor de Usuario
    public Estudiante(int id, String nombre, String email) {
        super(id, nombre, email); // Llama al constructor de la clase padre
    }
}
