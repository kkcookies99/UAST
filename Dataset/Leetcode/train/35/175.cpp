 class Solution {
public:
    int XXX(vector<int>& nums, int target) {
        int low = 0,high = nums.size()-1,mid;
        while(low <= high)
        {
            mid = (high + low)/2;

            if(nums[mid] == target)
            {
                return mid;
            }
            else if(nums[mid] > target)
            {
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return low;
    }
};

