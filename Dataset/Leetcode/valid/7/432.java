  public int XXX(int x) {
        int res = 0;
       while(x != 0){
      int digit = x % 10;
      if(x < 0 && res < Integer.MIN_VALUE /10  || x < 0 &&  res == Integer.MIN_VALUE /10  && digit > 8 || x > 0 && res == Integer.MAX_VALUE /10  && digit > 7 || x > 0 && res > Integer.MAX_VALUE/10){
          return 0;
      }
      res = 10 * res + digit;
      x = x /10;
       }
      return res;
    }

