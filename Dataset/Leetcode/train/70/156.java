class Solution {
    public int XXX(int n) {
        if(n<=2)
            return n;
        int tmp=1;
        int copy;
        int res=2;
        for(int i=3;i<=n;i++){
            copy=res;
            res+=tmp;
            tmp=copy;
        }
       return res;
       
    }
}

