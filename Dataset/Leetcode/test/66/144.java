 class Solution {
    public int[] XXX(int[] digits) {
        int index = digits.length - 1, carry = 1;
        do{
            int num = digits[index] + carry;
            carry = (num >= 10) ? 1 : 0;
            digits[index--] = num % 10;
        }while(index >= 0 && carry > 0);
        if(carry == 0)
            return digits;
        int[] resultant = new int[digits.length + 1];
        for(int i = 1; i < resultant.length; i++){
            resultant[i] = digits[i - 1];
        }
        resultant[0] = 1;
        return resultant;
    }
}

