public class Directivo extends Empleado {

    public Directivo(String nombre) {
        super(nombre);
        System.out.println("Nombre del Directivo: " + nombre);
    }

    @Override
    public String toString() {
        return "Directivo{}";
    }
}
