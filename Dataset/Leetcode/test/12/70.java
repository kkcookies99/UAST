 class Solution {
    static final int[] number = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    static final String[] str = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    public String XXX(int num) {
        StringBuilder res = new StringBuilder();
        int i = 0;
        while (num > 0) {
            while (num < number[i]) ++i;
            res.append(str[i]);
            num -= number[i];
        }
        return res.toString();
    }
}

