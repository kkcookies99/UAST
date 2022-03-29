 class Solution {
public:
    int XXX(vector<int>& nums, int target) {
        if(nums.size()==0)
            return 0;
        int left = 0;
        int right = nums.size() - 1;
        while(left<right){
            int mid = (left+right)/2;
            if(nums[mid]>=target)
                right = mid;
            else
                left = mid + 1;
        }
        if(left==nums.size()-1&&target>nums[left])
            return left+1;
        return left;
    }
};

