//4.30 (Palíndromos)Un palíndromo es una secuencia de caracteres que se lee igual al derecho y al revés. 
//     Por ejemplo, cada uno de los siguientes enteros de cinco dígitos es un palíndromo: 12321, 55555, 
//     45554 y 11611. Escriba una aplicación que lea un entero de cinco dígitos y determine si es un palíndromo. 
//     Si el número no es de cinco dígitos, el programa debe mostrar un mensaje de error y permitir al usuario 
//     que introduzca un nuevo valor. 

import java.util.Scanner;

public class Ejercicio430 {

    public static void main(String[] args) 
    {
        int cf, d1, d2, d3, d4, d5;

        Scanner entrada = new Scanner(System.in);

        System.out.print("\n------------------------------------------------------------------------------");
        System.out.print("\nAplicacion que lee un entero de cinco digitos y determina si es un palindromo");
        System.out.print("\n------------------------------------------------------------------------------\n");
        System.out.println("\nIngrese un numero de cinco digitos: ");
        cf = entrada.nextInt();

        while (!(cf>=10000&&cf<=99999))
        {
            System.out.println("\nERROR: El numero tiene que ser de cinco digitos, ingreselo nuevamente.");
            cf = entrada.nextInt();
        }

        d1= cf/10000;
        d2= (cf%10000)/1000;
        d3= (cf%1000)/100;
        d4= (cf%100)/10;
        d5= (cf%10);

        
        if(d1==d5 && d2==d4)
        { 
            System.out.println("\nEl numero ES PALINDROMO");
            System.out.print("\n------------------------------------------------------------------------------\n");
      
        }

        else
        System.out.println("\nEl numero NO ES PALINDROMO");
        System.out.print("\n------------------------------------------------------------------------------\n");
  
    }

} 