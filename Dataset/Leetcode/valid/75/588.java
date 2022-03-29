 class Solution {
    public void XXX(int[] nums) {
        int zeroCount=0,oneCount=0,twoCount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeroCount++;
            }else if(nums[i]==1){
                oneCount++;
            }else{
                twoCount++;
            }
        }
        int count=0;
        while(zeroCount>0){
            nums[count++]=0;
            zeroCount--;
        }
        while(oneCount>0){
            nums[count++]=1;
            oneCount--;
        }
        while(twoCount>0){
            nums[count++]=2;
            twoCount--;
        }
    }
}

