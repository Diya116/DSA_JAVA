// Find Peak Element
// A peak element is an element that is strictly greater than its neighbors.
//leetcode link:https://leetcode.com/problems/find-peak-element/
public class find_peak_element {
      public int findPeakElement(int[] arr) {
         int start=0;
        int end=arr.length-1;
       
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
            {
                end=mid;
            }
            else{
                start=mid+1;
            }
           
        }
        return start;
    }
}
