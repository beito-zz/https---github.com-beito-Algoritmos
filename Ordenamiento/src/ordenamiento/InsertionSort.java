
package ordenamiento;

public class InsertionSort 

{
    
    public int[] insert(int[] arr)//Funciona!
    
    {
        
        int i, j, newValue;
        
        for (i = 1; i < arr.length; i++) 
        
        {
            
            newValue = arr[i];
            j = i;
            
            while (j > 0 && arr[j - 1] > newValue) 
            
            {
                
                arr[j] = arr[j - 1];
                j--;
            
            }
            
            arr[j] = newValue;
            
        }
        
        return arr;
        
    }
    
    public int[] inserting(int[] num)
            
    {
        
        int j;                     // the number of items sorted so far
        int key;                // the item to be inserted
        int i;  

        for (j = 1; j < num.length; j++)    // Start with 1 (not 0)
            
        {
            
            key = num[ j ];
            
            for(i = j - 1; (i >= 0) && (num[ i ] < key); i--)   // Smaller values are moving up
            
            {
            
                num[ i+1 ] = num[ i ];
             
            }
            
            num[ i+1 ] = key;    // Put the key in its proper location
            
        }
        
        return num;
        
    }

}
