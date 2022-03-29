 class Solution {
    public int XXX(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start+1<end){
            int middle = start + (end - start)/2;
            if(target >= nums[middle]){
                start = middle;
            }else{
                end = middle;
            }
        }

        if(nums[start] == target){
            return start;
        }

        if(nums[end] == target){
            return end;
        }

        if(target>nums[end]){
            return end+1;
        }

        if(target < nums[start]){
            return start == 0?0:start -1;
        }

        return end;

    }
}

