 class Solution {
    public int[] XXX(int[] digits) {
        int n = digits.length;
        int[] result = new int[n+1];
        int carry = 1;
        for(int i = n-1;i >= 0;i--){
            int temp = digits[i] + carry;
            carry = temp  / 10;
            result[i+1] = temp % 10;
        }
        if(carry == 0){
            System.arraycopy(result,1,digits,0,n);
            return digits;
        }
        else{
            result[0] = carry;
            return result;
        }

    }
}

