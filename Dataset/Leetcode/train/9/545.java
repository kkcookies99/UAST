 class Solution {
    public boolean XXX(int x) {
        if(x<0){
            return false;
        }
        int n=0,before=x;
        while(x!=0){
            n=n*10+x%10;
            x=x/10;
        }
        if(before==n){
            return true;
        }
        return false;
    }
}

