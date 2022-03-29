 class Solution {
public:
    int XXX(vector<int>& nums, int target) {
        int len = nums.size();
        if(len < 0){
            return -1;
        }
        int start = 0;
        int end = len - 1;
        if(target <= nums[0]){
            return 0;
        }
        if(target > nums[len - 1]){
            return len;
        }
        while(start < end){
            if(end - start == 1 && target >= nums[start] && target <= nums[end]){
                return end;
            }
            int mid = (start + end) / 2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] > target){
                end = mid;
            }
            if(nums[mid] < target){
                start = mid;
            }   
        }
        
        
    }
};```

