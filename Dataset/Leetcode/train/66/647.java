class Solution {
    public int[] XXX(int[] digits) {
        /**数学思路:
        正常情况：最后以为小于等于8 正常加以
        特殊情况：[9,9] 加以变为[1,0,0]
         */
        //遍历数组先将最后一个元素加1 如果加1不等于10 说明没有进位
        //直接返回数组
        //如果有进位 则通过求余使其变0 并遍历下一个元素 如果没有进位，加以返回数组 如[1,2,9] 变为 [1,3,0]
        for (int i = digits.length-1; i >= 0; i--){
            digits[i]++;
            digits[i] %= 10;
            if (digits[i] != 0 ){
                return digits;
            }
        }
        //如果遍历完 都有进位 则说明是特殊值 [9,9,9..]
        //创建新的数组,长度比之前多1,且第一个元素为1
        digits = new int[digits.length+1];
        digits[0] = 1;
        return digits;
    }
}

