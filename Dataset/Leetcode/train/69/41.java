class Solution {
    public int XXX(int x) {
        int y = 0;
        while (true) {
            long square = (long) y * y;
            if (square == x) {
                return y;
            }
            if (square > x) {
                return y - 1;
            }
            if (square < x) {
                y += 1;
            }
        }
    }
}

