 class Solution {
    public int XXX(String s) {
        if (s.length() == 0) {
            return 0;
        }
        Set<Character> set = new HashSet<>();
        int left = 0;
        int right = 0;
        int length = 0;
        while(left < s.length() && right < s.length()) {
            if(set.contains(s.charAt(right))) {
                set.remove(s.charAt(left++));//set中不可能出现两个一样的字符
            } else {
                set.add(s.charAt(right++));
            }
            if (set.size() > length) {
                length = set.size();
            }
        }
        return length;
    }
}

