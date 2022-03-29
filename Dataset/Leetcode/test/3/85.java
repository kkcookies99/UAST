 class Solution {
    public int XXX(String s) {
        int length = 0;
        int left = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
                length = Math.max(length, i - left + 1);
            } else {
                while (true) {
                    char tmp = s.charAt(left++);
                    if (tmp == s.charAt(i)) {
                        break;
                    }
                    set.remove(tmp);
                }
            }
        }
        return length;
    }
}

