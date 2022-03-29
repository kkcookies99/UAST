class Solution {
    static String[] table = new String[31];
    static {
        table[1] = "1";
        for (int k = 2; k <= 30; k++) {
            StringBuilder sb = new StringBuilder();
            String s = table[k-1];
            for (int i = 0, j = 0; j < s.length();) {
                while (j < s.length() && s.charAt(j) == s.charAt(i)) {
                    j++;
                }
                sb.append(j - i);
                sb.append(s.charAt(i));
                i = j;
            }
            table[k] = sb.toString();
        }
    }
    public String XXX(int n) {
        return table[n];
    }
}

