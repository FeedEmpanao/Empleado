public class Operario extends Empleado {

    public Operario(String nombre) {
        super(nombre);
        System.out.println("Nombre del operario: " + nombre);
    }

    @Override
    public String toString() {
        return "Operario{" + getNombre() +
                "}";
    }
}
