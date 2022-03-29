class Solution {
    public int XXX(int n) {
        if(n<=2) return n;
        int pre1 = 1, pre2=2, res=0;
        int x = 2;
        while(x++<n){
            res=pre1+pre2;
            pre1=pre2;
            pre2=res;
        }
        return res;
    }
}

