 class Solution {
    public int[] XXX(int[] digits) {
        int n = digits.length;
        for(int i = n - 1; i >= 0; i--){
            digits[i] += 1;
            if(digits[i] > 9)
                digits[i] = 0;
            else
                break;
        }
        if(digits[0] == 0){ // 避免[9,9,9]情况，边界问题，扩充数组
            digits = new int[n + 1];
            digits[0] = 1;
        }
        return digits; 
    }
}

