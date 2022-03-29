 public boolean XXX(int x) {
        if(x<0) return false;
        if(x==0) return true;
        String s=String.valueOf(x);
        char[] c=s.toCharArray();
        int len=c.length;
        int l=0;
        int r=len-1;
      
      while(l<r){
          if(c[l]==c[r]){
              l++;
              r--;
              continue;
          }
          return false;
      }
      return true;
    }

