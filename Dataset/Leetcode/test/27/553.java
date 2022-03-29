 class Solution {
    public int XXX(int[] nums, int val) {
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0]==val?0:1;
        }

        //数组长度大于2的情况
        int left = -1;
        int right = 0;

        while (right<nums.length){
            if(nums[right]==val||nums[right]<0){
                left = right;
                while (right+1<nums.length){
                    right++;
                    if(nums[right]!=val&&nums[right]>=0){
                        break;
                    }
                }
                if(nums[right]==val||nums[right]<0){
                    return left;
                }
                nums[left] = nums[right];
                nums[right] = -1;
                right = left+1;
            }else{
                right++;
            }
        }

        if(left==-1){
            return nums.length;
        }
        return left;
    }
}

