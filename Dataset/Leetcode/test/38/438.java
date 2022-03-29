 class Solution {
    public String XXX(int n) {
        String res = "1";
        for (int i = 0; i < n - 1; ++i) {
            res = next(res);
        }
        return res;
    }

    public String next(String str) {
        if (str.length() == 1) {
            return "1" + str;
        }
        StringBuilder sb = new StringBuilder();
        int pre = 0;
        int i = 0;
        for (; i < str.length() - 1; ++i) {
            if (str.charAt(i) != str.charAt(i + 1)) {
                sb.append(i + 1 - pre).append(str.charAt(i));
                pre = i + 1;
            }
        }
        if (str.charAt(str.length() - 1) == str.charAt(str.length() - 2)) {
            sb.append(i + 1 - pre).append(str.charAt(i));
        } else {
            sb.append("1").append(str.charAt(str.length() - 1));
        }
        return sb.toString();
    }
}


