 class Solution {
    public int[] XXX(int[] digits) {
        int t = 0, n = digits.length;
        for(int i = n - 1; i >= 0; i--) {
            int x = digits[i] + 1;
            digits[i] = x % 10;
            t = x / 10;
            if(t == 0) break;
        }
        if(t != 0) {
            int[] tmp = new int[n + 1];
            tmp[0] = t;
            for(int i = 0; i < n; i++) {
                tmp[i + 1] = digits[i];
            }
            return tmp;
        }
        return digits;
    }
}

