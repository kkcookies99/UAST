class Solution {
    public int XXX(int n) {
        if(n==1)return 1;
        if(n==2)return 2;
        int f1=1;
        int f2=2;
        int fx=0;
        for(int i=0;i<=n-3;i++){
            fx=f1+f2;
            f1=f2;
            f2=fx;
        }
        return fx;
    }
}

