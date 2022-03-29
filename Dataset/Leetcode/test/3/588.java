 class Solution {
    public int XXX(String s) {

        int left = 0;
        int right = 0;
        int ans = 0;
        Set set = new HashSet<Character>();

        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
            }
            else {
                ans = Math.max(ans, right-left);
                while (s.charAt(left) != s.charAt(right)) {
                    set.remove(s.charAt(left));
                    left++;
                }
                left++;
            }
            right++;
        }
        return Math.max(ans, right-left);
    }
}

