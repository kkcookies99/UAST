 class Solution {
    public boolean XXX(int x) {
        if(x<0){
            return false;
        }
        int m=x;
        long a=0;
        while (x!=0){
            a=a*10;
            a=a+x%10;
            x=x/10;
        }
        if((int)a==m){
            return true;
        }
        return false;
    }
}

