 class Solution {
public:
    int XXX(vector<int>& nums, int target) {
        int n=nums.size();
        int low=0,high=n;
        while(low<high){
            int mid=low+(high-low)/2;
            if(nums[mid]>target)high=mid;
            else if(nums[mid]<target)low=mid+1;
            else return mid;
        }
        return low;
    }
};

