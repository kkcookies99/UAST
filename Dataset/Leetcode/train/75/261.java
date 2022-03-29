class Solution {
    public void XXX(int[] nums) {
        if(nums.length==0||nums.length==1){
            return;
        }
    int l=nums.length;
    int temp1=0;
    int temp2=0;
    int temp3=l-1;
    while(temp1<=temp3){
        while(temp2<l&&nums[temp2]==0){
            temp2++;
        }
        while(temp3>=0&&nums[temp3]==2){
            temp3--;
        }
        if(temp1>temp3){
            break;
        }
        if(nums[temp1]==2){
            int temp=nums[temp1];
            nums[temp1]=nums[temp3];
            nums[temp3]=temp;
        }
        if(nums[temp1]==0&&temp1>temp2){
            int temp=nums[temp1];
            nums[temp1]=nums[temp2];
            nums[temp2]=temp;
        }
        temp1++;
    }
    }
}

