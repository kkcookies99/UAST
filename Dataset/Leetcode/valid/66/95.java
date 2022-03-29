 class Solution {
    public int[] XXX(int[] digits) {
        if (digits == null){
            return null;
        }

        int len = digits.length, i = len - 1;
        while(i >=0 ){
            if(digits[i] + 1 < 10){
                digits[i] = digits[i] + 1;
                return digits;
            }
            
            digits[i] = (digits[i] + 1)%10;
            i--;
        }
        
        int[] res = new int[len+1];
        res[0] = 1;

        System.arraycopy(digits, 0, res, 1, len + 1 - 1);
        return res;

    }
}

