 class Solution {
    public String XXX(int n) {
        if (n == 1) {
            return "1";
        }
        String prev = XXX(n-1);
        StringBuilder result = new StringBuilder();
        int start = 0;
        for (int i = 0; i < prev.length();) {
            while (i < prev.length() && prev.charAt(start) == prev.charAt(i)) {
                i++;
            }
            result.append(i-start).append(prev.charAt(start));
            start = i;
        }
        return result.toString();
    }
}

