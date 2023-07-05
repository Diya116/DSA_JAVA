import java.lang.reflect.Array;
import java.util.Arrays;

public class bubblesort {
   public static void  bubblesorting(int[] arr)
   {
    int swape=0;
    for(int j=0;j<arr.length;j++)
    {
     for(int i=1;i<arr.length-j;i++)
     {
        if(arr[i-1]>arr[i])
        {  
           int  temp=arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=temp;
            swape++;
        }

     }
     if(swape==0)
      {
        break;
      }
   }
}
    public static void main(String[] args) {
        int[] arr={21,19,8,23,30,15};
        int[] arr1={1,2,3,4,5};
        bubblesorting(arr);
        System.out.println(Arrays.toString(arr));
        // for(int i=0;i<arr1.length;i++)
        // {
        //     System.out.println(arr1[i]+" ");
        // }
        
    }
    
}
