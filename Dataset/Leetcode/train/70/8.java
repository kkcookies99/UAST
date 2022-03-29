class Solution {
    public int XXX(int n) {
        // 跟斐波那契数列一样
        if(n <= 2) return n;
        int a = 1, b = 2, sum = 0;
        
        for(int i = 3; i <= n; i++){
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
}

