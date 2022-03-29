 class Solution {
    public String XXX(int num) {
        final String[] keys = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        final int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder res = new StringBuilder();

        int index = 0;
        while (num > 0) {
            for (int i = index; i < keys.length; i++) {
                if (num >= values[i]) {
                    res.append(keys[i]);
                    num -= values[i];

                    index = i;
                    break;
                }
            }
        }

        return res.toString();
    }
}

