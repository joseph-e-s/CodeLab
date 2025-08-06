package codelabproyecto;

import model.Profesor;
import model.Estudiante;
import model.Problema;
import model.Gestor;

public class codelabproyecto {
    public static void main(String[] args) {
        
        // Creamos un gestor que manejará usuarios, problemas y envíos
        Gestor gestor = new Gestor();

        // ----------- Agregar usuarios -----------
        Profesor prof = new Profesor(1, "Profesor Juan", "juan@uni.cr"); // Creamos un profesor
        Estudiante est = new Estudiante(2, "Estudiante Ana", "ana@uni.cr"); // Creamos un estudiante

        gestor.agregarUsuario(prof); // Guardamos el profesor en el gestor
        gestor.agregarUsuario(est);  // Guardamos el estudiante en el gestor

        // ----------- Crear problemas -----------
        Problema p1 = new Problema(100, "Suma basica", "Sumar dos numeros", "Facil"); // Creamos un problema
        gestor.crearProblema(p1); // Guardamos el problema en el gestor

        // ----------- Leer problema -----------
        Problema leido = gestor.leerProblema(100); // Obtenemos el problema con id 100
        System.out.println("Problema leido: " + leido.getTitulo()); // Mostramos el título

        // ----------- Actualizar problema -----------
        Problema pActualizado = new Problema(
            100, 
            "Suma avanzada", 
            "Sumar numeros con validacion", 
            "Media"
        ); // Creamos un problema con misma ID pero datos nuevos

        gestor.actualizarProblema(100, pActualizado); // Actualizamos el problema en el gestor

        // ----------- Leer problema actualizado -----------
        Problema actualizado = gestor.leerProblema(100); // Volvemos a leer el problema
        System.out.println("Problema actualizado: " + actualizado.getDescripcion()); // Mostramos su descripción

        // ----------- Borrar problema -----------
        gestor.borrarProblema(100); // Eliminamos el problema con ID 100
        if (gestor.leerProblema(100) == null) {
            System.out.println("Problema borrado con exito."); // Confirmamos que fue borrado
        }
    }
}

