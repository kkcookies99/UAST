 class Solution {
    public String XXX(int num) {
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder string = new StringBuilder();
        int index = 0;
        while(index < 13) {
            while(num >= nums[index]){
                string.append(romans[index]);
                num -= nums[index]; 
            }
            index++;
        }
        return string.toString();
    }
}

