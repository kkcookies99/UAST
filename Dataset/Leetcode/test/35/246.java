 class Solution {
    public int XXX(int[] nums, int target) {
        int min = 0;
        int max = nums.length-1;
        while(min<=max){
            int mid = min+(max-min)/2;
            if(target == nums[mid]) return mid;
            else if(target>nums[mid]) min = mid+1;
            else max = mid-1;
        }
        //在数组长度范围内可以插入
        for(int i=0; i<nums.length; i++){
            if(target < nums[i]) return i;            
        }
        //最后一个中可能，即不满足二分法查找目标值，也不能在数组长度范围内插入。只能插入到最后一个元素的后面。
        return nums.length;
    }

}

