class Solution {
    public void XXX(int[] nums) {
        int num0 = 0,num1=0,num2=0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 0){
                num0++;
            }else if(nums[i] == 1){
                num1++;
            }else{
                num2++;
            }
        }
        int p = 0,q = num0,m = num1+num0;
        for(int i = 0;i<nums.length;){
            if(nums[i] == 0){
                if(i < num0){
                    i++;
                }else{
                    swap(nums,i,p++);
                }
            }else if(nums[i] == 1){
                if(i>=num0&&i<num1+num0){
                    i++;
                }else{
                    swap(nums,i,q++);
                }
            }else{
                if(i>=num0+num1){
                    i++;
                }else{
                    swap(nums,i,m++);
                }
            }
        }
    }

    public void swap(int[] nums,int m,int n){
        int temp = nums[m];
        nums[m] = nums[n];
        nums[n] = temp;
    }
}

