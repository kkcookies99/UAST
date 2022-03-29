class Solution {
    
    public int XXX(int x) {
        int result = 0;
        int f = 1;
        if (x < 0) {
            f = -1;
            x = -x;
        }
        while (x != 0) {
            int latestNum = x % 10;
            if ((result * 10) / 10 != result) {
                return 0;
            }
            result = result * 10 + latestNum;
            x /= 10;
        }
        return result * f;
    }
}

