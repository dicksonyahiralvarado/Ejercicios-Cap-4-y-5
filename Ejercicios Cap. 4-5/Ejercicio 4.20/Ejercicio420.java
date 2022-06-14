//4.20 (Calculadora del salario) Desarrolle una aplicación en Java que determine el sueldo bruto para cada 
// uno de tres empleados. La empresa paga la cuota normal en las primeras 40 horas de trabajo de cada empleado, 
// y cuota y media en todas las horas trabajadas que excedan de 40. Usted recibe una lista de los empleados de 
// la empresa, el número de horas que trabajó cada uno la semana pasada y la tarifa por horas de cada empleado. 
// Su programa debe recibir como entrada esta información para cada empleado, para luego determinar y mostrar 
// el sueldo bruto de cada trabajador. Utilice la claseScanner para introducir los datos. 

import java.util.Scanner;

public class Ejercicio420 
{
    
    public void calcularSueldo() 
    {
        Scanner entrada = new Scanner(System.in);

        int contador = 0;
        int horas = 0;
        double cuota = 0.0;
        double sueldo = 0.0;

        System.out.print("\n------------------------------------------------------------------------------");

        while ( contador < 3) {
            System.out.println("\nIngrese las horas trabajadas del Empleado " + (contador + 1) + ": ");
            horas = entrada.nextInt();

            System.out.println("Ingrese la cuota por hora: ");
            cuota = entrada.nextDouble();
            if ( horas <= 40 ) 
            {
                sueldo = horas * cuota;
            } 
            else 
            {
                sueldo = (40 * cuota) + (horas-40) * (cuota*1.5) ;
            }

            System.out.println("\nEl sueldo bruto del Empleado " + (contador + 1) + " es: Lps." + sueldo);

            contador++;

            System.out.print("\n------------------------------------------------------------------------------");

        }
    }
    
    public static void main(String[] args) 
    {
        Ejercicio420 sueldoBruto = new Ejercicio420();
        sueldoBruto.calcularSueldo();
    }
}