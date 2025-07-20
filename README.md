# Gestión de Empleados - Unidad 3 (Herencia en Java)

Este proyecto extiende la aplicación de gestión de empleados de la Unidad 2, aplicando **herencia** para demostrar reutilización de código y polimorfismo en Java.

---

## **Clases del proyecto**

### 1. `Empleado` (Clase base)
- Contiene los atributos: `nombre`, `edad`, `salario`.
- Incluye el método `mostrarInformacion()` para imprimir los datos del empleado.

### 2. `EmpleadoTiempoCompleto` (Subclase)
- Hereda de `Empleado`.
- Añade un atributo `bonoAnual`.
- Implementa el método `calcularSalarioTotal()` y sobrescribe `mostrarInformacion()` para mostrar el bono y salario total.

### 3. `EmpleadoPorHoras` (Subclase)
- Hereda de `Empleado`.
- Añade `horasTrabajadas` y `tarifaPorHora`.
- Implementa el método `calcularSalario()` y sobrescribe `mostrarInformacion()` para mostrar detalles del empleado por horas.

---

## **Código principal (`Main.java`)**

```java
public class Main {
    public static void main(String[] args) {
        // Crear empleado de tiempo completo con bono anual
        EmpleadoTiempoCompleto emp1 = new EmpleadoTiempoCompleto("Ana", 30, 15000, 5000);

        // Crear empleado por horas con tarifa y horas trabajadas
        EmpleadoPorHoras emp2 = new EmpleadoPorHoras("Carlos", 25, 150, 160);

        System.out.println("=== Empleado Tiempo Completo ===");
        emp1.mostrarInformacion();

        System.out.println("\n=== Empleado Por Horas ===");
        emp2.mostrarInformacion();
    }
}
## **Salida del programa**

Al ejecutar `Main.java`, se obtiene la siguiente salida:

=== Empleado Tiempo Completo ===
Nombre: Ana
Edad: 30
Salario: $15000.0
Bono Anual: $5000.0
Salario Total: $20000.0

=== Empleado Por Horas ===
Nombre: Carlos
Edad: 25
Salario: $24000.0
Horas Trabajadas: 160
Tarifa por Hora: $150.0

