import java.util.Scanner;

public class Ejercicios7a13 {

    double precio = 100;
    double iva = 0.21;

    int cantidadProductos = 0;

    public void muestraValores()
    {
        System.out.println("El precio es " + precio);
        System.out.println("El iva es " + iva);
        System.out.println("El total es " + precio * (1+iva));
    }

    public void muestraValoresTotales()
    {
        System.out.println("El precio es " + precio);
        System.out.println("El iva es " + iva);
        System.out.println("El total es " + precio * (1+iva));
    }

    public static void main (String args[])
    {

        Ejercicios7a13 ejercicios7a13 = new Ejercicios7a13();

        //ejercicio 7
        ejercicios7a13.muestraValores();

        //ejercicio 8
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto");
        try
        {
            // ingresamos precio como string
            String precioString = scanner.nextLine();
            //parseamos y pisamos precio
            ejercicios7a13.precio = Double.parseDouble(precioString);
            ejercicios7a13.muestraValores();
        }
        catch (NumberFormatException e)
        {
            System.out.println("Por favor ingrese un número válido");
            System.out.println(e.getMessage());
        }

        //ejercicio 9
        System.out.println("Ingrese un número");
        try
        {
            // ingresamos valor como string
            String numeroString = scanner.nextLine();
            //parseamos
            double numeroDouble = Double.parseDouble(numeroString);
            if (numeroDouble > 100)
                System.out.println(numeroDouble + " es mayor a 100");
            else
            {
                System.out.println(numeroDouble + " es menor o igual a 100");
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println("Por favor ingrese un número válido");
            System.out.println(e.getMessage());
        }

        //ejercicio 10
        System.out.println("Ingrese su edad");
        try
        {
            // ingresamos valor como string
            String numeroString = scanner.nextLine();
            //parseamos
            int numeroInt = Integer.parseInt(numeroString);
            if (numeroInt >= 18 & numeroInt <70 )
                System.out.println("Debe votar");
            else if (numeroInt >= 70)
            {
                System.out.println("Está exceptuado pero puede votar si lo desea");
            }
            else
            {
                System.out.println("No puede votar aún");
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println("Por favor ingrese un número válido");
            System.out.println(e.getMessage());
        }

        //ejercicio 11
        System.out.println("Ingrese su nota");
        try
        {
            // ingresamos valor como string
            String numeroString = scanner.nextLine();
            //parseamos
            int numeroInt = Integer.parseInt(numeroString);
            if (numeroInt >= 6)
                System.out.println("Aprobó");
            else if (numeroInt >= 4 ) //no hace falta la segunda condicion "& numeroInt <6" porque siempre es verdadera al llegar acá
            {
                System.out.println("Debe rendir en diciembre");
            }
            else if (numeroInt !=3)
            {
                System.out.println("Debe rendir en marzo");
            }
            else
            {
                System.out.println("Consulte su nota a porquemepusieron3@miescuela.com");
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println("Por favor ingrese un número válido");
            System.out.println(e.getMessage());
        }


        //ejercicio 12
        try
        {
            System.out.println("Ingrese el precio del producto");
            // ingresamos precio como string
            String precioString = scanner.nextLine();
            //parseamos y pisamos precio
            ejercicios7a13.precio = Double.parseDouble(precioString);

            System.out.println("Ingrese la cantidad comprada");
            String cantidadString = scanner.nextLine();
            ejercicios7a13.cantidadProductos = Integer.parseInt(cantidadString);
            double monto = ejercicios7a13.precio * ejercicios7a13.cantidadProductos;
            double descuento = 0.05;

            System.out.println("Monto total de venta: " + monto);
            if (monto > 2000)
            {
                System.out.println("Descuento: " + (monto*descuento));
                System.out.println("Total: " + (monto - (monto*descuento)));
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println("Por favor ingrese un número válido");
            System.out.println(e.getMessage());
        }

        //ejercicio 13
        try
        {
            System.out.println("Ingrese el precio del producto");
            // ingresamos precio como string
            String precioString = scanner.nextLine();
            //parseamos y pisamos precio
            ejercicios7a13.precio = Double.parseDouble(precioString);

            System.out.println("Ingrese la cantidad comprada");
            String cantidadString = scanner.nextLine();
            ejercicios7a13.cantidadProductos = Integer.parseInt(cantidadString);

            System.out.println("Ingrese x si paga con Tarjeta de crédito");
            String tarjeteo = scanner.nextLine();
            double monto = ejercicios7a13.precio * ejercicios7a13.cantidadProductos;
            double descuento = 0.05;
            double recargo = 0.1;
            System.out.println("Monto total de venta: " + monto);
            if (tarjeteo.equalsIgnoreCase("x"))
            {
                System.out.println("Recargo con tarjeta " + (monto*recargo));
                System.out.println("Final total: " + (monto* (1+recargo)));
            }
            else if (monto > 2000)
            {
                System.out.println("Descuento: " + (monto*descuento));
                System.out.println("Total: " + (monto - (monto*descuento)));
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println("Por favor ingrese un número válido");
            System.out.println(e.getMessage());
        }

    }


}
