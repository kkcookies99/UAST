 class Solution {
    public String XXX(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        int cycle = 2 * numRows - 2;
        int length = (s.length() + 1)/cycle;
        char[] arr = new char[s.length()];
        int index = 0;
        for (int i = 0; i <= length; i++) {
            if (i * cycle < s.length()) {
                arr[index++] = s.charAt(i * cycle);
            }
        }
        for (int j = 1; j < numRows - 1; j++) {
            for (int i = 0; i <= length; i++) {
                if (i * cycle + j < s.length()) {
                    arr[index++] = s.charAt(i * cycle + j);
                }
                if (i * cycle + cycle - j < s.length()) {
                    arr[index++] = s.charAt(i * cycle + cycle  - j);
                } 
            }
        }
        for (int i = 0; i <= length; i++) {
            if (i * cycle + numRows - 1 < s.length()) {
                arr[index++] = s.charAt(i * cycle + numRows - 1);
            }
        }
        return String.valueOf(arr);
    }
}

