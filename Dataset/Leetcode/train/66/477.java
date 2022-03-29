class Solution {
    public int[] XXX(int[] digits) {
         for(int i = digits.length - 1; i >= 0; i--){
            digits[i]++;
            if(digits[i]>=10){
                if(i == 0){
                    int[] res = new int[digits.length+1];
                    res[0] = 1;
                    return res;
                }
                digits[i] = 0;
            }else{
                break;
            }
        }
        return digits;
    }
}

