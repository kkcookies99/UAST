 class Solution {
    public int XXX(String s) {
        int maxLen = 0;
        int start = 0, end = 0;
        for (; end < s.length(); end++) {
            int indexOf = s.substring(start, end).indexOf(s.charAt(end));
            if (indexOf != -1) {
                maxLen = Math.max(maxLen, end - start);
                start += indexOf + 1;
            }
        }
        return Math.max(maxLen, end - start);
    }
}

