 class Solution {
    public boolean XXX(int x) {
        if (x < 0) {
            return false;
        }
        if (x == 0) {
            return true;
        }
        int ans = 0;
        int temp = x;
        while (temp != 0) {
            ans = ans * 10 + temp % 10;
            temp /= 10;
        }
        return ans == x;
    }
}

