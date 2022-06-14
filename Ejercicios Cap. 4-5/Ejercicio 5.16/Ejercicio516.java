//5.16 (Programa para imprimir gráficos de barra) a Una aplicación interesante de las computadoras es la 
//     visualización de gráficos convencionales y de barra. Escriba una aplicación que lea cinco números, 
//     cada uno entre 1 y 30. Por cada número leído, su programa debe mostrar el mismo número de asteriscos 
//     adyacentes. Por ejemplo, si su programa lee el número 7, debe mostrar *******. Muestre las barras de 
//     asteriscosdespués de leer los cinco números. 

import java.util.Scanner; 
  
  public class Ejercicio516 
{         
    public void Imprime()
    {     
        System.out.print("\nEscriba cinco numeros enteros entre el 1 y 30.\n");

        Scanner entrada = new Scanner(System.in);

        int numero;
        int contador = 1;

        while ( contador <= 5 )
        {         
            System.out.printf("\nIngrese el numero %d:\n", contador);
            numero = entrada.nextInt();
            
            if ((1 <= numero) && ( 30 >= numero))
            {     

                for ( int i = 1; i <= numero; i++ )
                System.out.print("*");

                contador++;
            }       
        } 
        System.out.println();        
    }               
}        