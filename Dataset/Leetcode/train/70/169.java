class Solution {
    public int XXX(int n) {
        if(n == 0 || n == 1|| n==2) return n;
        int [] res = new int[n+1];
        res[0] = 0;
        res[1] = 1;
        res[2] = 2;
        for(int i=3 ; i <= n ; i ++){
            res[i] = res[i - 1] + res[i -2];
        }
        return res[n ];
    }
}

