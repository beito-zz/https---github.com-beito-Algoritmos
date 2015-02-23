
package ordenamiento;

public class BubbleSort 

{

    public int[] bubbleSort(int[] arr)//Funciona!

    {

        boolean swapped = true;
        int j = 0;
        int tmp;
        
        while (swapped)
        {
            
            swapped = false;
            j++;
            
            for (int i = 0; i < arr.length - j; i++)

            {
                if (arr[i] > arr[i + 1])
                {
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    swapped = true;
                }

            }

        }
        
        return arr;

    }
    
}
