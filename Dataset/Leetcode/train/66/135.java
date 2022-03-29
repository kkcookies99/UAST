 class Solution {
    public int[] XXX(int[] digits) {
        int left=0;
        boolean update =true;
        for(int i=digits.length-1;i>=0;i--){
            if(update){
                update=false;
                left=(digits[i]+1)/10;
                digits[i]=(digits[i]+1)%10;
                if(left>0)update=true;
                else break;
            }
        }
        int[] ans=null;
        if(update){
            ans=new int[digits.length+1];
            System.arraycopy(digits,0,ans,1,digits.length);
            ans[0]=1;
        }else{
            ans=digits;
        }
        return ans;
    }
}

