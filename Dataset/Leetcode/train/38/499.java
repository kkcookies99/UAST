 class Solution {
    public String XXX(int n) {
        if (n == 2) return "11";
        if (n == 1) return "1";
        int count = 1;
        String s = XXX(n - 1);
        StringBuilder sb = new StringBuilder();
        char c = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }else{
                sb.append(count).append(c);
                c = s.charAt(i);
                count = 1;
            }
            if (i == s.length() - 1) {
                sb.append(count).append(c);
            }
        }
        return sb.toString();
    }
}  

