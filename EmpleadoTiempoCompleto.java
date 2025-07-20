/**
 * Clase derivada EmpleadoTiempoCompleto que extiende Empleado,
 * añade un bono anual y calcula el salario total incluyendo el bono.
 */
public class EmpleadoTiempoCompleto extends Empleado {
    private double bonoAnual;

    public EmpleadoTiempoCompleto(String nombre, int edad, double salario, double bonoAnual) {
        super(nombre, edad, salario);
        this.bonoAnual = bonoAnual;
    }

    /**
     * Calcula el salario total sumando el salario base y el bono anual.
     * @return salario total anual
     */
    public double calcularSalarioTotal() {
        return salario + bonoAnual;
    }

    /**
     * Muestra la información del empleado, incluyendo el bono y salario total.
     */
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Bono Anual: $" + bonoAnual);
        System.out.println("Salario Total: $" + calcularSalarioTotal());
    }
}
