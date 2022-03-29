class Solution {
    public int[] XXX(int[] digits) {
        int n = digits.length;
        int[] arr = new int[n + 1];
        int index = n - 1;
        digits[index] = digits[index] + 1;
        while(digits[index--] > 9){
            digits[index+1] = 0;
            if(index < 0){
                arr[0] = 1;
                for(int i = 0; i < n; i++){
                    arr[i + 1] = digits[i];
                }
                return arr;
            }
            digits[index] = digits[index] + 1;
        }
        return digits;
    }
}

