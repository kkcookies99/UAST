 class Solution {
    public String XXX(String s, int numRows) {
        if (numRows <= 1) {
            return s;
        }
        char[] array = new char[s.length()];
        int index = 0;
        int n = (numRows - 1) * 2;
        for (int i = 0; i < numRows; i++) {
            int x = i;
            while (x < s.length()) {
                array[index] = s.charAt(x);
                index++;
                if (i == 0) {
                    x += n;
                    continue;
                }
                if (i == numRows - 1) {
                    x += n;
                    continue;
                }
                if ((x + i) % n == 0) {
                    x = x + 2 * i;
                    continue;
                }
                x = x + n - 2 * i;
            }
        }
        return String.valueOf(array);
    }
}

