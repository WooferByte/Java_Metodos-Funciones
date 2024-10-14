// Una empresa quiere calcular el precio final de sus productos después de aplicar un descuento general del 10%.
//- Crea un arreglo `preciosOriginales` que almacene el precio original de varios productos.
//- Escribe una función `calcularPrecioFinal` que aplique el descuento a cada producto y devuelva el precio final.

public class Ejercicio_9 {
    public static void main(String[] args) {

        double[] preciosOriginales = {
                100.00, 250.50, 300.00, 150.00, 600.30, 80.25, 500.00
        };

        calcularPrecioFinal(preciosOriginales);
    }

    public static void calcularPrecioFinal(double[] preciosOriginales) {
        System.out.println("Precios finales después del descuento del 10%:");

        for (double preciosOriginale : preciosOriginales) {
            double descuento = preciosOriginale * 0.10;
            double precioFinal = preciosOriginale - descuento;
            System.out.println("Precio original: $" + preciosOriginale + " - Precio final: $" + precioFinal);
        }
    }
}
