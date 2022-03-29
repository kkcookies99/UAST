 class Solution {
public:
    int XXX(vector<int>& nums, int target) {
        int len = nums.size();
        int result;
        search_partial(nums,0,len-1,target,result);
        return result;
    }
    void search_partial(vector<int>& nums, int i, int j, int target,int& result)
    {
        int mid = (i+j)/2;
        if(i>j)
        {
            if(i>nums.size()-1)
                result = nums.size();
            else if(j<0)
                result = 0;
            else
                result = i;
            return;
        }
        if(nums[mid]==target)
        {
            result = mid;
            return;
        }
        else if(nums[mid]<target)
            search_partial(nums,mid+1,j,target,result);
        else
            search_partial(nums,i,mid-1,target,result); 
    }
};

