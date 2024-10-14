// Una empresa ofrece descuentos a sus clientes dependiendo de la cantidad de compras que han realizado. Si han comprado
// más de 10 veces, reciben un 10% de descuento.
//- Crea un arreglo `clientes` y otro `compras` que almacene la cantidad de compras de cada cliente.
//- Escribe una función `calcularDescuentos` que recorra el arreglo y aplique el descuento a los clientes que
// califiquen.

public class Ejercicio_4 {
    public static void main(String[] args) {
        String[] clientes = {
                "Juan Pérez", "Ana López", "Carlos García", "María Rodríguez", "Luis Fernández", "Sofía Martínez"
        };

        int[] compras = {
                8, 12, 5, 15, 9, 11
        };

        calcularDescuentos(clientes, compras);
    }

    public static void calcularDescuentos(String[] clientes, int[] compras) {
        System.out.println("Clientes que reciben un 10% de descuento:");

        for (int i = 0; i < clientes.length; i++) {
            if (compras[i] > 10) {
                System.out.println(clientes[i] + " - Compras: " + compras[i] + " (10% de descuento)");
            }
        }
    }
}

