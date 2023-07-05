//Search Insert Position
//Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
//You must write an algorithm with O(log n) runtime complexity.
//leetcode link:https://leetcode.com/problems/search-insert-position/
public class search_insert_pos {
     public int searchInsert(int[] a, int searchkey) {
        int lb=0;
        int n=a.length;
        int ub=n-1;
        int curr;
        while(true)
        {
            curr=(lb+ub)/2;
            if(a[curr]==searchkey)
             return curr;
             else if (lb>ub)
              return lb;
            else{
                if(a[curr]>searchkey)
                {
                  ub=curr-1;
                }
                else
                {
                    lb=curr+1;
                }
            }
           
        }
    }
}
