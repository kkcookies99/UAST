 class Solution {
    public String XXX(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] reps = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuffer buffer = new StringBuffer();
        int r = num;
        for (int i = 0; i < values.length; i++) {
            int d = r / values[i];
            for (int j = 0; j < d; j++) {
                buffer.append(reps[i]);
            }
            r = r % values[i];
        }

        return buffer.toString();
    }
}

