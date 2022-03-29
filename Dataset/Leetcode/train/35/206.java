 class Solution {
    public int XXX(int[] nums, int target) {
        if (nums.length == 0) {
            return 1;
        }
        if (nums[nums.length-1]<target) {
            return nums.length;
        }
        if (nums[0] > target) {
            return 0;
        }

        return insertIndex(nums,target,0,nums.length-1);

    }

    public int insertIndex(int[]nums,int target,int lowIndex,int highIndex) {
        if (highIndex - lowIndex <=1) {
            if (nums[highIndex] < target) {
                return highIndex+1;
            } else if (nums[highIndex] >= target && nums[lowIndex] < target) {
                return highIndex;
            } else if (nums[lowIndex] >= target) {
                return lowIndex;
            }
        }
        int mid = (highIndex + lowIndex)/2;
        if (nums[mid] > target) {
            return insertIndex(nums,target,lowIndex,mid);
        } else {
            return insertIndex(nums,target,mid,highIndex);
        }
    }
}

