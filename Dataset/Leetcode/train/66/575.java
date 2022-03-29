class Solution {
    public int[] XXX(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i --) {
            // 一共有两种情况，最低位是9的和最低位不是9的，如果最低位是9，那么做变成0和下一位的加一操作，如果最后一位不是9，那么可以加1后直接做返回数组的操作
            if (digits[i] != 9) {
                digits[i] ++;
                return digits;
            }
            //这边就是digital[i]是9的情况
            // 这边做变成0的处理
            // 然后会再做下一次的判断
            digits[i] = 0;
        }
        //如果能运行到这一步，说明上面的每一位都是9，这个时候会产生进位
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}

