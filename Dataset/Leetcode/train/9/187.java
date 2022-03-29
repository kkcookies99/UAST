class Solution {
    public boolean XXX(int x) {
        if (0 <= x && x <= 9) return true;
        if (x < 0) return false;

        int temp = x;
        int result = 0;

        while (temp != 0) {
            result = result * 10 + temp % 10;
            temp /= 10;
        }

        return x == result;
    }
}

