class Solution {
    public int XXX(int n) {
        int t0=1;
        int t1=1;
        int res=1;
        for(int i=2;i<n+1;i++){
            res=t0+t1;
            t0=t1;
            t1=res;
        }
        return res;
    }
}

