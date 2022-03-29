class Solution {
    public int XXX(int m, int n) {
        int x = m - 1,y = n - 1;
        int total = x + y;
        long res = 1;
        for(int i=1;i<=(x<y?x:y);i++){
            res *= total;
            res /= i;
            total--;
        }
        return (int)res;
    }
}

