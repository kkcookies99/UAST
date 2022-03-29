class Solution {
    public int[] XXX(int[] digits) {
        int index=digits.length-1;
        digits[index]+=1;
        while(digits[index]==10){
            digits[index]=0;
            if(index==0){
                int[] res=new int[digits.length+1];
                res[0]=1;
                return res;
            }
            digits[--index]+=1;
        }
        return digits;
    }
}

