class Solution {
    public int XXX(int n) {
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        int a=1;
        int b=2;
        int c=0;
        for(int i=3;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
}

