 class Solution {
    public String XXX(String[] strs) {
        int n = strs.length;
        if(n == 0) return "";

        String str = strs[0];

        int min = str.length();
        for(int i = 1; i < n; i++) {
            String s = strs[i];
            for(int j = 0; j < min && j < s.length(); j++) {
                if(s.charAt(j) != str.charAt(j)) {
                    min = j;
                    break;
                }
            }
            min = Math.min(min,s.length());
        }

        return str.substring(0,min);
    }
}

