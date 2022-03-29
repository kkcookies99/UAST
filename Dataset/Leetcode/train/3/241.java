 class Solution {
    public int XXX(String s) {
        if (s.length() <= 1) {
            return s.length();
        }
        List<Character> tmp = new ArrayList<>();
        int index = 0, longest = 0;
        while(index < s.length()) {
            char c = s.charAt(index);
            if (tmp.contains(c)) {
                longest = Math.max(longest, tmp.size());
                tmp.remove(0);
            } else {
                index++;
                tmp.add(c);
            }
        }

        longest = Math.max(longest, tmp.size());
        return longest;
    }
}

