 class Solution {
    public int[] XXX(int[] digits) {
        if(digits[0] == 0){
            return new int[]{1};
        }
        int res = 0;
        for(int j = digits.length - 1; j>=0;j--){
            res = digits[j] + 1;
            if(res < 10){
                digits[j] += 1;
                return digits;
            }else{
                digits[j] = 0;
            }
        }
        int[] arr = new int[digits.length + 1];
        arr[0] = 1;
        return arr;
    }
}

