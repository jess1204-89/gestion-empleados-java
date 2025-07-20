/**
 * Clase base Empleado que contiene los atributos y métodos comunes
 * para todos los tipos de empleados.
 */
public class Empleado {
    // Nombre del empleado
    protected String nombre;
    // Edad del empleado
    protected int edad;
    // Salario base del empleado
    protected double salario;

    /**
     * Constructor que inicializa los atributos de un empleado.
     *
     * @param nombre  Nombre del empleado
     * @param edad    Edad del empleado
     * @param salario Salario base del empleado
     */
    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    /**
     * Muestra la información básica del empleado.
     */
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: $" + salario);
    }
}  // <-- Aquí cierra la clase
