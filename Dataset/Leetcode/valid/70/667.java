class Solution {
    public int XXX(int n) {
        if (n<=2) return n;
        return f(2, 1, n);
    }

    public int f(int a, int b, int n) {
        if (n<=2) return a;
        return f(a+b, a, n-1);
    }
}

