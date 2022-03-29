class Solution {
    public String XXX(int n) {
        String s = "1";
        if (n == 1) return s;
        int i = 1;
        while (i <= n - 1) {
            StringBuilder builder = new StringBuilder();
            char a = s.charAt(0);
            int count = 1;
            for (int j = 1; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c == a) {
                    count++;
                } else {
                    builder.append(count).append(a);
                    a = c;
                    count = 1;
                }
            }
            builder.append(count).append(a);
            s = builder.toString();
            i++;
        }
        return s;
    }
}

