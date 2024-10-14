// Una pequeña empresa debe calcular el impuesto de venta para cada una de las facturas emitidas.
//- Crea un arreglo facturas con los montos de las facturas de los clientes.
//- Escribe una función calcularImpuesto que aplique un 21% de impuesto a cada factura.

public class Ejercicio_6 {
    public static void main(String[] args) {
        double[] facturas = {
                100.00, 250.50, 320.75, 150.00, 600.30, 90.25, 500.00
        };

        calcularImpuesto(facturas);
    }

    public static void calcularImpuesto(double[] facturas) {
        System.out.println("Facturas con impuesto del 21% aplicado:");

        for (double factura : facturas) {
            double impuesto = factura * 0.21;
            double totalConImpuesto = factura + impuesto;
            System.out.println("Factura original: $" + factura + " - Total con impuesto: $" + totalConImpuesto);
        }
    }
}
