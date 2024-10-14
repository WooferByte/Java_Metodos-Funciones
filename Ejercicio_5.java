// Una empresa desea conocer el promedio de satisfacción de sus clientes basado en encuestas de calificación de 1 a 5.
//- Crea un arreglo `calificaciones` con las puntuaciones de satisfacción de los clientes.
//- Escribe una función `calcularPromedioSatisfaccion` que recorra el arreglo y calcule el promedio de satisfacción.

public class Ejercicio_5 {
    public static void main(String[] args) {

        int[] calificaciones = {
                5, 4, 3, 5, 2, 4, 5, 3, 4, 5, 1, 3
        };

        double promedio = calcularPromedioSatisfaccion(calificaciones);

        System.out.println("El promedio de satisfacción de los clientes es: " + promedio);
    }

    public static double calcularPromedioSatisfaccion(int[] calificaciones) {
        int suma = 0;
        for (int calificacione : calificaciones) {
            suma += calificacione;
        }
        return (double) suma / calificaciones.length;
    }
}

