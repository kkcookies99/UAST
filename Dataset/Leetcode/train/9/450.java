 class Solution {
    public boolean XXX(int x) {
        boolean flag = false;
        if(x < 0) {
            flag = false;
        }
        int y = x;
        int net = 0;
        while(y > 0) {
           int n = net;
           n *= 10;
           n += y % 10;
           y /= 10; 
           net = n;
        }
        return net == x;
    }
}

