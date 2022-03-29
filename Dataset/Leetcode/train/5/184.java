 class Solution {
    public String XXX(String s) {
        int maxLen = s.length();
        while (maxLen > 0){
            int start = 0;
            while (start + maxLen <= s.length()){
                String str = s.substring(start, start + maxLen - 1 + 1);
                if (isPalindrome(str)){
                    return str;
                }else {
                    start++;
                }
            }
            maxLen--;
        }
        return null;
    }
    public boolean isPalindrome(String s){
        int mid = s.length() / 2;
        int index = 0;
        while (index < mid){
            char i = s.charAt(index);
            char j = s.charAt(s.length() - 1 - index);
            if (i == j ){
                index++;
            }else {
                return false;
            }
        }
        return true;
    }
}

