class Solution {
    public int XXX(int n) {
        int f = 1;
        int g = 2;
        for(int i=2;i<=n;i++){
            g = f+g;
            f = g-f;
        }
        return f;
    }
}

