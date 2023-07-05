//Find Smallest Letter Greater Than Target
//leetcode:https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class find_smallest_letter {
      public char nextGreatestLetter(char[] a, char target) {
        int start=0;
        int end=a.length-1;
        while(start<=end)
        {
          int mid=start+(end-start)/2;

          if(target<a[mid])
          {
            end=mid-1;
          }
          else{
            start=mid+1;
          }
        }
      return a[start%a.length];
    }
}
