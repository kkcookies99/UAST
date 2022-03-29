class Solution {
    public int XXX(int x) {
        if (x == 0){
            return 0;
        }
        if(x == 1){
            return 1;
        }
          int l= 0,r = x;
          while(l + 1 != r){
              int m = (l + r)/2;
              if((long)m * m <= x){
                  l = m;
              }else{
                   r = m;
              }
          }
          return l;
    }
}

