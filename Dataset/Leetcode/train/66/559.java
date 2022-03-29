class Solution {
    public int[] XXX(int[] digits) {
        int n=digits.length;
        boolean allNine=true;
        for(int i=n-1;i>=0;i--){
            if(digits[i]!=9){
                allNine=false;
                digits[i]=digits[i]+1;
                return digits;
            }
            else{
                digits[i]=0;//当前位变成0，继续向前进位
            }
        }
        if(allNine){
            int[]res=new int[n+1];
            res[0]=1;
            return res;
        }
        return digits;
    }
}

