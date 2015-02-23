
package ordenamiento;

public class QuickSort 

{
    
    private int[] sorted;

    public int[] getSorted() {
        return sorted;
    }

    public void setSorted(int[] sorted) {
        this.sorted = sorted;
    }
    
    private int partition(int arr[], int left, int right)

    {
        
        int i = left, j = right;
        int tmp;
        int pivot = arr[(left + right) / 2];
     
        while (i <= j) 
        
        {
            
            while (arr[i] < pivot)

            {
                  
                i++;
              
            }
            
            while (arr[j] > pivot)
            
            {
                
                j--;
            
            }
            
            if (i <= j) 
            
            {
                
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
                    
            }
            
        }
     
        return i;
        
    }
 
    public void quick(int left, int right) 

    {
        
        int index = partition(this.sorted, left, right);
        
        if (left < (index - 1))
        
        {
            
            quick(left, (index - 1));
        
        }
        
        if (index < right)
        
        {
            
            quick(index, right);
            
        }
      
    }

}
