 class Solution {
    public int XXX(int m, int n) {
        int sum = m + n - 2;
        if (sum == 0) return 1;
        int max = Math.max(m, n);
        int min = Math.min(m, n);
        long num1 = 1, num2 = 1;
        for (int i = 0; i < min - 1; i++) {
            num1 *= (sum - i);
        }
        for (int i = 1; i < min ; i++) {
            num2 *= i;
        }
        return (int) (num1 / num2);
    }
}

