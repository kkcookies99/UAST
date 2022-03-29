class Solution {
    public boolean XXX(int x) {
        if(x<0) return false;
        if(x==0) return true;
        int n = 0,y = x;
        while(x > 0){
            n *= 10;
            n += x%10;
            x /= 10;
        }
        if(n==y) return true;
        else return false;
    }
}

