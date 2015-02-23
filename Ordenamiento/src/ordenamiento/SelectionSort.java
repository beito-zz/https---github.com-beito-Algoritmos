/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

/**
 *
 * @author beito
 */
public class SelectionSort 

{
    
    public int[] select(int[] arr)

    {//8,5,2
    
        int i, j, minIndex, tmp;
        int n = arr.length;

        for (i = 0; i < n - 1; i++)//2
        
        {
        
            minIndex = i;
            
            for (j = i + 1; j < n; j++)//3
            
            {
            
                if (arr[j] < arr[minIndex])//j=2;i=>5;
                
                {
                
                    minIndex = j;
                
                }
            
            }
            
            if (minIndex != i)
                
            {
                
                tmp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = tmp;
                
            }
        
        }
        
        return arr;
    
    }
    
}
