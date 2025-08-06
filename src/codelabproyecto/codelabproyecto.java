package codelabproyecto;

import model.Estudiante;
import model.Gestor;
import model.Problema;
import model.Profesor;

public class codelabproyecto {
    public static void main(String[] args) {
        Gestor gestor = new Gestor();

        // Agregar usuarios
        Profesor prof = new Profesor(1, "Profesor Juan", "juan@uni.cr");
        Estudiante est = new Estudiante(2, "Estudiante Ana", "ana@uni.cr");

        gestor.agregarUsuario(prof);
        gestor.agregarUsuario(est);

        // Crear problemas
        Problema p1 = new Problema(100, "Suma básica", "Sumar dos números", "Fácil");
        gestor.crearProblema(p1);

        // Leer problema
        Problema leido = gestor.leerProblema(100);
        System.out.println("Problema leído: " + leido.getTitulo());

        // Actualizar problema
        Problema pActualizado = new Problema(100, "Suma avanzada", "Sumar números con validación", "Media");
        gestor.actualizarProblema(100, pActualizado);

        // Leer problema actualizado
        Problema actualizado = gestor.leerProblema(100);
        System.out.println("Problema actualizado: " + actualizado.getDescripcion());

        // Borrar problema
        gestor.borrarProblema(100);
        if (gestor.leerProblema(100) == null) {
            System.out.println("Problema borrado con éxito.");
        }
    }
}
