class Solution {
    public int[] XXX(int[] digits) {
        int len = digits.length;
        for (int i = len-1; i >=0; i--) {
            if (digits[i] == 9) 
                digits[i] = 0;
            else {
                digits[i]++;
                return digits;
            }
        }    
        //处理类似 [9,9,9] 的情况
        int[] arr = new int[len+1];
        arr[0] = 1;
        return arr;
    }
}

