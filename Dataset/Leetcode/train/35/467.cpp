 class Solution {
public:
    int XXX(vector<int>& nums, int target) {
    int left=0,len=nums.size(),right=len-1;
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(target<nums[mid])//target<nums[mid]
                right=mid-1;
            else if(target>nums[mid])
                left=mid+1;
            else return mid;
        }
        //if(left+1>=0)
        if(right<0)return 0;
        if(left<len)return left;
        return len;
    }
};

