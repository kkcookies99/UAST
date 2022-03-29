 class Solution {
     public String XXX(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        int[] range = new int[2];
        char[] c = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            i = find(c, i, range);
        }
        return s.substring(range[0], range[1] + 1);
    }

    private int find(char[] c, int low, int[] range) {
        int max = c.length - 1;
        int high = low;
        while (high < max && c[high + 1] == c[low]) {
            high++;
        }
        int result = high;
        while (low > 0 && high < max && c[low - 1] == c[high + 1]) {
            low--;
            high++;
        }
        if (high - low > range[1] - range[0]) {
            range[0] = low;
            range[1] = high;
        }
        return result;
    }
}

