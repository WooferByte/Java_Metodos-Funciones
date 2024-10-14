// Una pequeña tienda registra sus ventas diarias en un arreglo. Se necesita escribir una función que use un bucle para
// calcular los ingresos totales mensuales.
//- Crea un arreglo `ventas` que almacene las ventas diarias de una tienda durante 30 días.
//- Escribe una función `calcularIngresosMensuales` que recorra el arreglo y sume las ventas.
//- Imprime el total de ingresos mensuales.

public class Ejercicio_1 {
    public static void main(String[] args) {
        double[] ventas = {
                100.50, 200.75, 150.00, 80.00, 120.40, 175.25, 90.60, 300.10,
                110.75, 210.80, 50.30, 60.20, 230.45, 190.00, 100.00, 250.90,
                130.20, 160.10, 240.30, 310.40, 180.50, 170.00, 190.20, 210.00,
                100.50, 90.40, 80.30, 130.60, 110.50, 140.20
        };

        double totalIngresos = calcularIngresosMensuales(ventas);

        System.out.println("El total de ingresos mensuales es: $" + totalIngresos);
    }

    public static double calcularIngresosMensuales(double[] ventas) {
        double total = 0;
        for (int i = 0; i < ventas.length; i++) {
            total += ventas[i];
        }
        return total;
    }
}

