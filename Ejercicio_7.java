// Una tienda de ropa ofrece un 15% de descuento a las compras superiores a $500.
//- Crea un arreglo `compras` que almacene los montos de las compras de los clientes.
//- Escribe una función `aplicarDescuento` que aplique el descuento a las compras que superen los $500.

public class Ejercicio_7 {
    public static void main(String[] args) {

        double[] compras = {
                450.00, 520.75, 600.00, 350.25, 1000.00, 200.50, 700.90
        };

        aplicarDescuento(compras);
    }

    public static void aplicarDescuento(double[] compras) {
        System.out.println("Compras con descuento aplicado:");

        for (double compra : compras) {
            if (compra > 500) {
                double descuento = compra * 0.15;
                double totalConDescuento = compra - descuento;
                System.out.println("Compra original: $" + compra + " - Total con 15% de descuento: $" + totalConDescuento);
            } else {
                System.out.println("Compra original: $" + compra + " - No aplica descuento.");
            }
        }
    }
}
