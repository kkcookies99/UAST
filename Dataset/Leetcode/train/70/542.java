class Solution {
    public int XXX(int n) {
        if (n ==0 || n ==1) {
            return n;
        }
        int [] m = new int[n];
        m[0]=1;
        m[1]=2;
        for(int i = 2; i < n; i++) {
            m[i] = m[i - 2] + m[i-1];
        }
        return m[n - 1];
    }
}

