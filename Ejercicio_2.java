// Una tienda de electrónica necesita un informe del inventario, mostrando los productos que tienen menos
// de 5 unidades en stock.
//- Crea un arreglo productos que almacene los nombres de los productos y otro arreglo stocks que almacene la cantidad de stock de cada producto.
//- Escribe una función generarReporteBajoStock que imprima los productos con menos de 5 unidades.

public class Ejercicio_2 {
    public static void main(String[] args) {
        String[] productos = {
                "Televisor", "Laptop", "Teléfono", "Teclado", "Mouse", "Impresora", "Auriculares", "Monitor", "Cámara"
        };

        int[] stocks = {
                10, 3, 15, 4, 20, 2, 8, 1, 5
        };

        generarReporteBajoStock(productos, stocks);
    }

    public static void generarReporteBajoStock(String[] productos, int[] stocks) {
        System.out.println("Productos con menos de 5 unidades en stock:");

        for (int i = 0; i < productos.length; i++) {
            if (stocks[i] < 5) {
                System.out.println(productos[i] + " - " + stocks[i] + " unidades");
            }
        }
    }
}

