 class Solution {
    public String XXX(String s) {
        String res = "";
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if ((len-i) <= res.length()) return res;
            for (int j = len; j > i; j--) {
                String substring = s.substring(i, j);
                if (Palindrome(substring)){
                    if ((j-i) > res.length()){
                        res = substring;
                    }
                    break;
                }
            }
        }
        return res;
    }

    private boolean Palindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while (left < right){
            if (s.charAt(left++) != s.charAt(right--)){
                return false;
            }
        }
        return true;
    }
}

