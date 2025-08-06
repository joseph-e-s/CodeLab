package model;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Gestor {

    private HashMap<Integer, Usuario> usuarios;
    private TreeMap<Integer, Problema> problemas;
    private LinkedHashMap<Integer, Envio> envios;

    public Gestor() {
        usuarios = new HashMap<>();
        problemas = new TreeMap<>();
        envios = new LinkedHashMap<>();
    }

    // CRUD Problema
    public void crearProblema(Problema p) {
        problemas.put(p.getId(), p);
    }

    public Problema leerProblema(int id) {
        return problemas.get(id);
    }

    public void actualizarProblema(int id, Problema nuevo) {
        if (problemas.containsKey(id)) {
            problemas.put(id, nuevo);
        } else {
            System.out.println("No existe problema con id " + id);
        }
    }

    public void borrarProblema(int id) {
        problemas.remove(id);
    }

    // Usuarios
    public void agregarUsuario(Usuario u) {
        usuarios.put(u.getId(), u);
    }

    public Usuario leerUsuario(int id) {
        return usuarios.get(id);
    }

    // Envios
    public void agregarEnvio(Envio e) {
        envios.put(e.getId(), e);
    }

    public Envio leerEnvio(int id) {
        return envios.get(id);
    }
    //comentario
}
