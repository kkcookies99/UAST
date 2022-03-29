class Solution {
   public int XXX(int x) {
        int y = 0,z = 0,m,n;
        m = x;
        while(x != 0) {
            y = y * 10 + x%10;
            x = x / 10;
        }
        n = y;
        while(y != 0) {
            z = z * 10 + y%10;
            y = y / 10;
        }
        if(m == z| m % 10 == 0)
        return n;
        else return 0;
    }
}

