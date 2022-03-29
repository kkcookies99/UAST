class Solution {
    public int[] XXX(int[] digits) {
        int carry = (digits[digits.length - 1] + 1) /10;
        digits[digits.length - 1] = (digits[digits.length - 1] + 1) % 10;
        for(int i = digits.length - 2; i >=0; i--){
            int temp = (digits[i] + carry) % 10;
            carry = (digits[i] + carry) /10;
            digits[i] = temp;
        }
        if(carry == 1){
            int[] res = new int[digits.length+1];
            res[0] = 1;
            return res;
        }
        return digits;
    }
}

