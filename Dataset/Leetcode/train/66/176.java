 class Solution {
    public int[] XXX(int[] digits) {
        if (digits.length < 1 || digits.length > 100)
            return null;

        int len = digits.length - 1;
        // 如果尾数是9 找出尾数之前的9的数量
        while (len >= 0 && digits[len] + 1 - 10 == 0) {
            len--;
        }

        // 如果全是9
        if (len < 0) {
            // 创建新的数组
            int[] nums = new int[digits.length + 1];
            // 将数组第一个数赋值为1
            nums[0] = 1;
            return nums;
        }else if /* 如果没有9 */ (len == digits.length){
            // 将原数组最后一个数+1
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
            return digits;
        }else {// 如果尾数是9 
            //将9和9之后数据设置为0
            for (int i = len + 1; i < digits.length; i++) {
                digits[i] = 0;
            }
            //将最后一个9之前的数+1
            digits[len] = digits[len] + 1;
            return digits;
        }
    }
}

