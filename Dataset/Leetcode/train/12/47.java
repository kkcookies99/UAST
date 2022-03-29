 class Solution {
    
    private static final char[] CHAR;

    static {
        CHAR = new char[]{'I', 'V', 'X', 'L', 'C', 'D', 'M'};
    }

    public String XXX(int num) {
        int n = 1000;
        int idx = 6;
        int temp;
        StringBuilder sb = new StringBuilder();
        for (; n > 0; idx -= 2, n /= 10) {
            temp = (num / n) % 10;
            if ((temp % 5) == 4) {
                sb.append(CHAR[idx]).append(CHAR[idx + 1 + (temp / 5)]);
                continue;
            }

            if (temp >= 5) {
                sb.append(CHAR[idx + 1]);
                temp -= 5;
            }

            for (int i = 0; i < temp; i++) {
                sb.append(CHAR[idx]);
            }
        }

        return sb.toString();
    }
}

