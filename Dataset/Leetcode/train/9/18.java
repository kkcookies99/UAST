class Solution {
    public boolean XXX(int x) {
        if(x<0)
            return false;
        int rem=0,y=0;
        int quo=x;
        while(quo!=0){
            rem=quo%10;
            y=y*10+rem;
            quo=quo/10;
        }
        return y==x;
    }
}

