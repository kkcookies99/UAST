 class Solution {
    public int[] XXX(int[] digits) {
        int index = 0;
   for (int i = digits.length - 1; i >= 0; i--) {
            
            if(i == digits.length - 1){
                if(digits[i] +1 > 9){
                    digits[i] = 0;
                    index =1;
                    if(i == 0){
                        digits = new int[digits.length + 1];
                        digits[0] = 1;
                    }
                }else {
                    digits[i] =digits[i]+1;
                    break;
                }
            }else if(index > 0){
                if(digits[i] +1 > 9){
                    digits[i] = 0;
                    if(i == 0){
                        digits = new int[digits.length + 1];
                        digits[0] = 1;
                    }
                }else {
                    digits[i] = digits[i]+1;
                   break;
                }
            }
        }
        return digits;
    }
}

