 class Solution {
    public String XXX(String s, int numRows) {
        String sb = "";
        for (int i = 0; i < numRows; i++) {
            boolean up = false;
            for (int j = i; j < s.length(); ) {
                up = !up;
                if (!up && i == 0) continue;
                if (up && i == numRows - 1) continue;
                sb += s.charAt(j);
                j += up ? 2 * (numRows - 1 - i) : 2 * i;
            }
        }
        return sb;
    }
}

