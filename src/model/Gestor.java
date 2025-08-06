package model;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Gestor {

    // Lista de usuarios (id → Usuario)
    private HashMap<Integer, Usuario> usuarios;

    // Lista de problemas ordenados por id (id → Problema)
    private TreeMap<Integer, Problema> problemas;

    // Lista de envíos en el orden en que fueron agregados (id → Envio)
    private LinkedHashMap<Integer, Envio> envios;

    // Constructor: inicializa las colecciones
    public Gestor() {
        usuarios = new HashMap<>();       // Usuarios no necesitan estar ordenados
        problemas = new TreeMap<>();      // Problemas ordenados por id automáticamente
        envios = new LinkedHashMap<>();   // Envios en el orden en que se insertan
    }

    // ---------------- CRUD de Problema ----------------

    // Crear un problema
    public void crearProblema(Problema p) {
        problemas.put(p.getId(), p);
    }

    // Leer un problema por id
    public Problema leerProblema(int id) {
        return problemas.get(id);
    }

    // Actualizar un problema existente
    public void actualizarProblema(int id, Problema nuevo) {
        if (problemas.containsKey(id)) {
            problemas.put(id, nuevo);
        } else {
            System.out.println("No existe problema con id " + id);
        }
    }

    // Borrar un problema por id
    public void borrarProblema(int id) {
        problemas.remove(id);
    }

    // ---------------- Gestión de Usuarios ----------------

    // Agregar un usuario
    public void agregarUsuario(Usuario u) {
        usuarios.put(u.getId(), u);
    }

    // Leer un usuario por id
    public Usuario leerUsuario(int id) {
        return usuarios.get(id);
    }

    // ---------------- Gestión de Envíos ----------------

    // Agregar un envío
    public void agregarEnvio(Envio e) {
        envios.put(e.getId(), e);
    }

    // Leer un envío por id
    public Envio leerEnvio(int id) {
        return envios.get(id);
    }
}
