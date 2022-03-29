 class Solution {
public:
    int XXX(vector<int>& nums, int target) {
        int mid,begin,end;
        begin=0;end=nums.size()-1;
        while(begin<=end)
        {
            mid=begin+(end-begin)/2;
            if(nums[mid]>target)
                end=mid-1;
            else if(nums[mid]<target)
                begin=mid+1;
            else
                return mid;
        }
        return nums[0]>=target?  0:begin;
    }
};

