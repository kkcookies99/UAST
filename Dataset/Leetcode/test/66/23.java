 class Solution {
    public int[] XXX(int[] digits) {
        int length = digits.length;
        // 防止没必要的进入没必要的循环语句
        if(length == 1 && digits[0] == 9){
            return new int[]{1,0};
        }
        for(int index = length - 1;index >= 0; index--){
            if(digits[index] != 9){
                digits[index]++;
                return digits;
            }
            digits[index] = 0;
        }
        int[] arr = new int[length+1];
        arr[0] = 1;
        return arr;
    }
}

