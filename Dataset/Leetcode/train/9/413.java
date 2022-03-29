 class Solution {
    public boolean XXX(int x) {
        int copy = x;
        if(x<0){
            return false;
        }
        long n =0;
        while(x!=0){
            n=n*10+x%10;
            x=x/10;
        }
        n =(int) n==n?(int)n:0;
        if(n==copy){
            return true;
        }
        return false;
    }
}

