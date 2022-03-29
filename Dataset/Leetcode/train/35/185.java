 class Solution {
    public int XXX(int[] nums, int target) {
        int res=0;
        int left=0,right=nums.length-1;
        if (target>nums[right]){
            return right+1;
        }else if (target<=nums[left]){
            return left;
        }else if (target==nums[right]){
            return right;
        }
        while (left <=right){
            int mid=(left+right)/2;

            if (nums[mid] > target){
                right=mid-1;
            }else if (nums[mid] <target){
                left=mid+1;
            }else if (nums[mid]==target){
                return mid;
            }

                if (nums[right]<target){
                    return right+1;
                }else if ( nums[left]>target){
                    return left;
                }
        }
        return res;
    }
}

