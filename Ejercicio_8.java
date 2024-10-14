// Una empresa de servicios necesita llevar el control de las horas trabajadas por sus empleados durante una semana.
//- Crea un arreglo `empleados` con los nombres de los empleados y otro arreglo `horasTrabajadas` con las horas
//  trabajadas en la semana.
//- Escribe una función `calcularPagoSemanal` que calcule el pago semanal (a razón de $15 por hora trabajada).

public class Ejercicio_8 {
    public static void main(String[] args) {

        String[] empleados = {
                "Juan Pérez", "Ana López", "Carlos García", "María Rodríguez", "Luis Fernández", "Sofía Martínez"
        };

        int[] horasTrabajadas = {
                40, 35, 50, 45, 38, 42
        };

        calcularPagoSemanal(empleados, horasTrabajadas);
    }

    public static void calcularPagoSemanal(String[] empleados, int[] horasTrabajadas) {
        double tarifaPorHora = 15.00;

        System.out.println("Pago semanal de los empleados:");

        for (int i = 0; i < empleados.length; i++) {
            double pagoSemanal = horasTrabajadas[i] * tarifaPorHora;
            System.out.println(empleados[i] + " - Horas trabajadas: " + horasTrabajadas[i] + " - Pago: $" + pagoSemanal);
        }
    }
}
