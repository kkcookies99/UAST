 class Solution {
    public boolean XXX(int x) {     
      if(x<0||(x%10==0&&x!=0))
      {
          return false;
      }
      int rev = 0;
      while(x!=0)
      {
          int digit = x%10;
          x/=10;
          rev = rev*10+digit;
      }
      return x==rev;
            
    }
}

