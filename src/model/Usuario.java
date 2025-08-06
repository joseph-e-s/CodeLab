package model;

public class Usuario {

    // Identificador único del usuario
    private int id;

    // Nombre completo del usuario
    private String nombre;

    // Correo electrónico del usuario
    private String email;

    // Constructor: crea un usuario con su id, nombre y email
    public Usuario(int id, String nombre, String email) {
        this.id = id;          // Guarda el id
        this.nombre = nombre;  // Guarda el nombre
        this.email = email;    // Guarda el email
    }

    // Obtiene el id del usuario
    public int getId() { 
        return id; 
    }

    // Obtiene el nombre del usuario
    public String getNombre() { 
        return nombre; 
    }

    // Obtiene el email del usuario
    public String getEmail() { 
        return email; 
    }

    // Cambia el nombre del usuario
    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }

    // Cambia el email del usuario
    public void setEmail(String email) { 
        this.email = email; 
    }
}


