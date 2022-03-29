 class Solution {
    public int[] XXX(int[] digits) {
        int n = digits.length;
        int count = 0;
        int t = 1;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] + t == 10){
                digits[i] = 0;
                t = 1;
                count++;
            }else {
                digits[i] += t;
                t = 0;
            }
        }
        int []a = new int[n+1];
        a[0] = 1;
        return count == n? a:digits;
    }
}```

