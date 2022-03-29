class Solution {
    public int[] XXX(int[] digits) {
        int i;
        for(i=digits.length-1;i>=0;i--)
        {
            if(digits[i]+1>=10) {
                digits[i] = (digits[i] + 1) % 10;
            }
            else
            {
                digits[i]=digits[i]+1;
                return digits;
            }
        }
        int[] res=new int[digits.length+1];
        res[0]=1;
        return res;
    }
}

