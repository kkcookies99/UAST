 class Solution {
    public int[] XXX(int[] digits) {
        int i=digits.length-1;
        while(i>=0&&++digits[i]>=10){
            digits[i]=0;
            i--;
        }
        if(i>=0) return digits;
            int result[]=new int[digits.length+1];
            result[0]=1;
            System.arraycopy(digits, 0, result, 1, digits.length);  
        return result;
    }
}

