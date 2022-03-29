 class Solution {
    public int[] XXX(int[] digits) {
        int n = digits.length;
        for(int i = n-1; i >= 0; i--){
            if(digits[i] != 9){ //当前元素不等于9就++，直接返回即可
                digits[i] ++;
                return digits;
            } else {  //当前元素等于9就置为0
                digits[i] = 0;
            }
        }
        //如果以上循环没执行return语句，就说明都是9
        int[] res = new int[n+1];
        res[0] = 1;
        return res;
    }
}

