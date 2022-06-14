//5.21 (Ternas pitagóricas) s Un triángulo rectángulo puede tener lados cuyas longitudes sean valores enteros. 
//     El conjunto de tres valores enteros para las longitudes de los lados de un triángulo rectángulo se 
//     conoce como terna pitagórica. Las longitudes de los tres lados deben satisfacer la relación que 
//     establece que la suma de los cuadrados de dos lados es igual al cuadrado de la hipotenusa. Escriba 
//     una aplicación que muestre una tabla de las ternas pitagóricas para lado1, lado2 y la hipotenusa, que 
//     no sean mayores de 500. Use un ciclo for triplemente anidado para probar todas las posibilidades. 
//     Este método es un ejemplo de la computación de “fuerza bruta”. En cursos de ciencias computacionales 
//     más avanzados aprenderá que existen muchos problemas interesantes para los cuales no hay otra 
//     metodología algorítmica conocida, más que el uso de la fuerza bruta. 

public class Ejercicio521

{      
    public int tamano = 500;
    public void Pitagoras()
    {  
        System.out.printf("\nLa aplicacion muestrara una tabla de las ternas pitagoricas para lado1, lado2 y la hipotenusa, que no sean mayores de %d \n ", tamano);
        System.out.print("-------------------------------------------------------------------------------------------------------------------------\n");


        for ( int i = 1; i <= tamano; i++ )
        for ( int j = 1; j <= tamano; j++ )
        for ( int k = 1; k <= tamano; k++ )
        {       
            if ( i*i == j*j + k*k )
            System.out.printf("%3d\t%3d\t%3d\n\n", i, j, k);
        }       
    }  
}   