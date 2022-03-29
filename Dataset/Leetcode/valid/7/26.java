class Solution {
    public int XXX(int x) {
        long number = 0;
        while (x != 0) {
            number = number * 10 + x % 10;
            x /= 10;
        }
        return (int) number == number ? (int) number : 0;
    }
}

