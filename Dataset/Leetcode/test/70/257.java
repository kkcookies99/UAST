class Solution {
    public int XXX(int n) {
        if(n==1||n==2){
            return n;
        }
        int sum=2,a=1,b=2,c=3;
        for(int i=0;i<=n-3;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
}

