package model;

// La clase Profesor hereda de Usuario
public class Profesor extends Usuario {

    // Constructor: crea un profesor usando el constructor de Usuario
    public Profesor(int id, String nombre, String email) {
        super(id, nombre, email); // Llama al constructor de la clase padre
    }
}