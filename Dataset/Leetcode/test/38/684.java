 class Solution {
    public String XXX(int n) {
        if (n == 1) {
            return "1";
        } else {
            StringBuilder str = new StringBuilder(XXX(n - 1));
            int count = 1;
            StringBuilder res = new StringBuilder();
            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) == str.charAt(i + 1)) {
                    count++;
                } else {
                    res.append(count).append(str.charAt(i));
                    count = 1;
                }
            }
            res.append(count).append(str.charAt(str.length() - 1));
            return new String(res);
        }
    }
}

