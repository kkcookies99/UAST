 class Solution {
public:
    int searchMethod(vector<int>&nums,int target,int lo,int hi){
        if(lo == hi){
            if(nums[lo] == target) return lo;
            if(nums[lo] > target) return lo;
            return lo+1;

        }
        int mid = lo+((hi-lo)>>1);
        if(nums[mid] >= target) return searchMethod(nums,target,lo,mid);
        return searchMethod(nums,target,mid+1,hi);
        
    }
    int XXX(vector<int>& nums, int target) {
        int lo = 0;
        int hi = nums.size()-1;
        return searchMethod(nums,target,lo,hi);
    }
};

