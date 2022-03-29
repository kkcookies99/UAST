class Solution {
    public int XXX(int m, int n) {
        return Combination(m + n - 2, Math.min(m - 1, n - 1));
    }
    private int Combination(int n, int k) {
        int factN = 1, factK = 1;
        int v;
        while (n > n-k) {
            factN *= n--;
            factK *= k--;
            v = gcd(factN, factK);
            factN /= v;
            factK /= v;
        }
        return factN;
    }
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


