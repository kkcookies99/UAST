 class Solution {
    public String XXX(int num) {
        int[] nums = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] strs = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder ans = new StringBuilder();
        int index = 0;
        while (num > 0) {
            while (index < nums.length && nums[index] > num) index++;
            ans.append(strs[index]);
            num -= nums[index];
        }
        return ans.toString();
    }
}

