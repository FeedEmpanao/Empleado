public class Oficial extends Empleado{

private String titulo;

    public Oficial(String nombre, String titulo) {
        super(nombre);
        this.titulo = titulo;
        System.out.println("Nombre del oficial: " +  nombre);
    }

    public Oficial(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Oficial{" + getNombre() +
                "}{titulo='" + titulo + '\'' +
                '}';
    }
}
