 class Solution {
    public int[] XXX(int[] digits) {
        int maxIndex = digits.length - 1;
        while(maxIndex >= 0 && digits[maxIndex] == 9){
            digits[maxIndex] = 0;
            maxIndex --;
        }
        if(maxIndex >= 0) digits[maxIndex] += 1;
        else {
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            digits = res;
        }
        return digits;
    }
}

