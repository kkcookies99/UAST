 class Solution {
    public int[] XXX(int[] digits) {
        int last = digits.length - 1;
        digits = zero(digits, last);
        return digits;
    }

    public int[] zero(int[] digits, int last){
        if(digits[last] == 9){
            if(last == 0){
                int[] result = new int[digits.length + 1];
                result[0] = 1;
                for(int i = 1; i <= digits.length; i++){
                    result[i] = 0;
                }
                return result;
            }else if(digits[last - 1] == 9){
                digits[last] = 0;
                return zero(digits, last - 1);
            }else{
                digits[last] = 0;
                digits[last - 1] += 1;
                return digits;
            }
        }
        digits[last] += 1;
        return digits;
    }
}

