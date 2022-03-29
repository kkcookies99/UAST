 class Solution {
    public int singleNumber(int[] nums) {
        int i,j,k;
        for(i=0;i<nums.length;i++){
            for(j=0,k=0;j<nums.length;j++){
                 if(nums[i]==nums[j])
                    k++;
                    if(k==3)break;
                 }
                 if(k==2)return nums[i];
            }
        }
    }

