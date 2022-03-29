 class Solution {
    public int XXX(int m, int n) {
        long res=1;
        for(int x=n,y=1;y<m;x++,y++){
            res=res*x/y;
        }
        return (int)res;
    }
}

