 class Solution {
    public int singleNumber(int[] nums) {
        //异或满足交换律

        int answer = 0;

        for(int num : nums) {
            answer ^= num;      //起初0和任何数异或等于本身
        }

        return answer;
    }
}

