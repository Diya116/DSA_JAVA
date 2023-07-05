// Arranging coin
// Problem Link: https://leetcode.com/problems/arranging-coins/
public class arrange_coin {
     public int arrangeCoins(int n) {
      if(n==1)
      return 1;
      int i=1;
      while(n>=i)
      {
          n=n-i;
          i++;
      }
      return i-1;
    }
}
