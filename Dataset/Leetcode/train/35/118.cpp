 class Solution {
public:
    int XXX(vector<int>& nums, int target) 
    {
        int left=0;
        int right=nums.size()-1;
        int mid=0;
        while(left<=right)
        {
            mid=(left+right)>>1;
            if(target==nums[mid])
                return mid;
            else if(target<nums[mid])
                right=mid-1;
            else
                left=mid+1;
        }
        return left;
    }
};