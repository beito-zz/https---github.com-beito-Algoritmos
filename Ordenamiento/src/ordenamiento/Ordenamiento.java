
package ordenamiento;

import java.util.Random;

public class Ordenamiento {

    public static void main(String[] args) 
    
    {
        
        Random rnd = new Random();
        
        long startTime, endTime;
        
        int[] arreglo = new int[1000000];
        
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = rnd.nextInt(10000000);
        }
        
        SelectionSort selected = new SelectionSort();
        startTime = System.currentTimeMillis();
        arreglo = selected.select(arreglo);
        endTime = System.currentTimeMillis();
        
        long tiempoFinal = (endTime - startTime);
        
        System.out.println("It took " + tiempoFinal + " miliseconds"); 
        
    }
    
}
