class Solution {
    public int XXX(int n) {
        // 爬上n阶楼梯，f(n) = f(n - 1) + f(n - 2)
        if(n == 1) return 1;
        if(n == 2) return 2;
        int a = 1, b = 2;
        for(int i = 3; i <= n; i++){
            int t = a + b;
            a = b;
            b = t;
        }
        return b;
    }
}

