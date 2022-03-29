class Solution {
    public int[] XXX(int[] digits) {
        int size=digits.length;
        for(int i=size-1;i>=0;i--){
            digits[i]=digits[i]==9?0:digits[i]+1;
            if(digits[i]!=0)
                break;
        }
        if(digits[0]==0){
            int[] nums=new int[size+1];
            for(int i=size;i>0;i--){
                nums[i]=digits[i-1];
            }
            nums[0]=1;
            return nums;
        }
        return digits;
    }
}

