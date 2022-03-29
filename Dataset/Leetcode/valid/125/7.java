 class Solution {
    public boolean XXX(String s) {
        if (s.isEmpty()) {
            return true;
        }
        List<Character> nums = new ArrayList();
        char[] cnt = s.toLowerCase().toCharArray();
        for (char c : cnt) {
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                nums.add(c);
            }
        }
        int left = 0, right = nums.size() - 1;
        while (left < right) {
            if (!nums.get(left++).equals(nums.get(right--))) {
                return false;
            }
        }
        return true;
    }
}

