class Solution {
    public void XXX(int[] nums) {
        int l=0; int r=nums.length-1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]==0){
                while(l<i&&nums[l]==0){
                    l++;
                }
                if(l<i){
                    int temp = nums[i];
                    nums[i]=nums[l];
                    nums[l] = temp;
                    i--;
                }
            }
            else if(nums[i]==2){
                while(r>i&&nums[r]==2){
                    r--;
                }
                if(r>i){
                    int temp = nums[i];
                    nums[i]=nums[r];
                    nums[r]=temp;
                    i--;
                }
            }
        }
    }
}

