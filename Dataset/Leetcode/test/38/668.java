 class Solution {
    public String XXX(int n) {
        if (n == 1) return "1";
        String s = XXX(n - 1);
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); ) {
            int j = i;
            while (j < s.length() && s.charAt(j) == s.charAt(i)) j ++;
            res.append(j - i).append(s.charAt(i));
            i = j;
        }
        return res.toString();
    }
}

