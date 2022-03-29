class Solution {
    public int XXX(int n) {
        if (n <= 2) return n;
        int first = 1;
        int second = 2;
        int index = 3;
        while(true) {
            int sum= first + second;
            first = second;
            second = sum;
            if (index++ == n) {
                return second;
            }
        }
    }
}

