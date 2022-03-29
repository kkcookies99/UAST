class Solution {
    public int XXX(int n) {
        if(n == 1 || n == 2) return n;
        int a = 1;
        int b = 2;
        int sum = a + b;
        for(int i = 3;i < n;i++){
            a = b;
            b = sum;
            sum = a + b;
        }
        return sum;
    }
}

