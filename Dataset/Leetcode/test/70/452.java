class Solution {
    public int XXX(int n) {
        int q=0,p=0,r=1;
        for(int i=1;i<=n;i++){
            p=q;
            q=r;
            r=q+p;
        }
        return r;
    }
}

