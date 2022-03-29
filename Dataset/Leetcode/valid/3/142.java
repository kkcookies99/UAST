 class Solution {
    public int XXX(String s) {
        int longest = 0;
        int pre = -1;
        for (int i = 0; i < s.length(); i++) {
            for(int j = pre + 1; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)){
                    pre = j;
                    break;
                }
            }
            longest = Math.max(i - pre, longest);
        }
        return longest;
    }
}

