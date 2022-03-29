 class Solution {
    public String XXX(int n) {
        if (n == 1) {
            return "1";
        }
        String str = XXX(n - 1);
        StringBuilder res = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (i == str.length() - 1 || str.charAt(i) != str.charAt(i + 1)) {
                res.append(count);
                res.append(str.charAt(i));
                count = 1;
            }
            else {
                count++;
            }
        }
        return res.toString();
    }
}

