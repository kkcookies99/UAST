 class Solution {
    public void XXX(int[] nums) {
        int after=nums.length-1;
        int before=0;
        int count0=0,count2=0;
        while(before<=after){
            if(nums[after]==0&&nums[before]==2){nums[before++]=0;nums[after--]=2;}
            else if(nums[after]==2) after--;
            else if(nums[before]==0) before++;
            else if(nums[after]==1){nums[after--]=2;count2++;}
            else if(nums[before]==1){nums[before++]=0;count0++;}
        }
        while(count0-->0) nums[after--]=1;
        while(count2-->0) nums[before++]=1;
    }
}


