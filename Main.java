// Archivo: Main.java

public class Main {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Ana", 30, 15000);
        Empleado emp2 = new Empleado("Carlos", 25, 12000);

        emp1.mostrarInformacion();
        System.out.println("-----");
        emp2.mostrarInformacion();
    }
}
