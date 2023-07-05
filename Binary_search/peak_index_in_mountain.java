//Peak Index in a Mountain Array
//leetcode:https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class peak_index_in_mountain {
      public static int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1])
            {
                return mid;
            }
            else if(arr[mid]>arr[mid+1] && arr[mid]<arr[mid-1])
            {
                end=mid-1;
            }
            else{
                start=start+1;
            }
        }
        return -1;
    }
}
