/**
 * Clase derivada EmpleadoPorHoras que extiende Empleado,
 * calcula el salario según las horas trabajadas y la tarifa por hora.
 */
public class EmpleadoPorHoras extends Empleado {
    private int horasTrabajadas;
    private double tarifaPorHora;

    /**
     * Constructor que inicializa el nombre, edad, tarifa por hora y horas trabajadas.
     * El salario se calcula con base en las horas y tarifa.
     *
     * @param nombre         Nombre del empleado
     * @param edad           Edad del empleado
     * @param tarifaPorHora  Pago por hora
     * @param horasTrabajadas Horas trabajadas en el periodo
     */
    public EmpleadoPorHoras(String nombre, int edad, double tarifaPorHora, int horasTrabajadas) {
        super(nombre, edad, 0); // Salario inicial 0, se calculará abajo
        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = horasTrabajadas;
        this.salario = calcularSalario(); // Actualiza el salario
    }

    /**
     * Calcula el salario multiplicando las horas trabajadas por la tarifa por hora.
     *
     * @return Salario calculado
     */
    public double calcularSalario() {
        return horasTrabajadas * tarifaPorHora;
    }

    /**
     * Muestra la información del empleado, incluyendo las horas trabajadas y tarifa.
     */
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Horas Trabajadas: " + horasTrabajadas);
        System.out.println("Tarifa por Hora: $" + tarifaPorHora);
    }
}
