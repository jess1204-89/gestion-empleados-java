public class Main {
    public static void main(String[] args) {
        // Crear un empleado de tiempo completo con bono anual
        // Esta clase hereda de Empleado y añade un bono anual
        EmpleadoTiempoCompleto emp1 = new EmpleadoTiempoCompleto("Ana", 30, 15000, 5000);

        // Crear un empleado por horas con tarifa y horas trabajadas
        // Esta clase hereda de Empleado y calcula salario por horas trabajadas
        EmpleadoPorHoras emp2 = new EmpleadoPorHoras("Carlos", 25, 150, 160);

        System.out.println("=== Empleado Tiempo Completo ===");
        // Muestra datos del empleado de tiempo completo,
        // reutilizando y sobrescribiendo el método mostrarInformacion() de Empleado
        emp1.mostrarInformacion();

        System.out.println("\n=== Empleado Por Horas ===");
        // Muestra datos del empleado por horas,
        // reutilizando y sobrescribiendo el método mostrarInformacion()
        emp2.mostrarInformacion();
    }
}
