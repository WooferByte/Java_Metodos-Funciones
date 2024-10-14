// Una pequeña empresa de servicios tiene una lista de clientes a los que debe enviar facturas, pero quiere procesar
// solo aquellos que tengan facturas pendientes por más de $500.
//- Crea un arreglo `clientes` que almacene los nombres de los clientes y un arreglo `facturasPendientes` con el monto de sus facturas pendientes.
//- Escribe una función `enviarFacturas` que imprima los nombres de los clientes con facturas mayores a $500.

public class Ejercicio_3 {
    public static void main(String[] args) {
        String[] clientes = {
                "Juan Pérez", "Ana López", "Carlos García", "María Rodríguez", "Luis Fernández", "Sofía Martínez"
        };

        double[] facturasPendientes = {
                350.75, 600.50, 450.00, 750.00, 200.25, 1200.00
        };

        enviarFacturas(clientes, facturasPendientes);
    }

    public static void enviarFacturas(String[] clientes, double[] facturasPendientes) {
        System.out.println("Clientes con facturas pendientes mayores a $500:");

        for (int i = 0; i < clientes.length; i++) {
            if (facturasPendientes[i] > 500) {
                System.out.println(clientes[i] + " - $" + facturasPendientes[i]);
            }
        }
    }
}

