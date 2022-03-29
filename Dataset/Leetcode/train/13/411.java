 class Solution {
    public int XXX(String s) {
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        int ans = 0, left = 0, right = 1, idx = 0;
        while (left < s.length()) {
            right = left + 1;
            if (s.substring(left, right).equals(roman[idx])) {
                ans += nums[idx];
                left += 1;
            } else if (right <= s.length() - 1 && s.substring(left, right + 1).equals(roman[idx+1])) {
                ans += nums[++idx];
                left += 2;
            } else {
                idx++;
            }
        }
        return ans;
    }
}

