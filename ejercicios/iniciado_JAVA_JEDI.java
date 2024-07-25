// suma de dos numeros

//////////////////////////////////////////////////////////////////////////////

/*
Dado un arreglo de 4 posiciones crear un programa en java
que permita tomar los dos valores del medio eliminando los extremos.
Mostrar por pantalla el resultado

{1,2,3,4} --> {2,3}

 */

public class iniciado_JAVA_JEDI {
    public static void main(String[] args){

        int[] enteros = {1,2,3,4};

        for(int i=enteros.length-2; i>0; i--){
            System.out.println("indice "+i+ " valor "+enteros[i]);
        }
    }

} 

/////////////////////////////////////////////////////////////////////////////