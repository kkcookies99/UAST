 public int XXX(int x) {
       int p = x % 10; x /= 10;
       while(x != 0) {
            int m = x % 10;
            if ((x>0&&(Integer.MAX_VALUE-m)/10<p) || (x<0&&p<(Integer.MIN_VALUE-m)/10)) return 0;
            p = p * 10 + m;
            x /= 10;
       }
       return p;
}

