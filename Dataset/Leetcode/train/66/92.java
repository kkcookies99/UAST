 class Solution {
    public int[] XXX(int[] digits) {
       return helper(digits,digits.length-1);
    }
    public int[] helper(int[] digits ,int index){
        int[] ans = null;
        if(index-1>=0&&digits[index]+1==10){
            digits[index] = 0;
            ans = helper(digits,index-1);
        }else if(index-1<0&&digits[index]+1==10){
            ans = new int[digits.length+1];
            ans[0] = 1;
            return ans;
        }else{
            digits[index] +=1;
            ans = digits;
        }
        return ans;
    }
}

