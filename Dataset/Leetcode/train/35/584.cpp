 class Solution {
public:
    int XXX(vector<int>& nums, int target) {
        int left=0;
        int right=nums.size()-1;
        int mid;
        while(left<=right){
            mid=left+(right-left)/2;
            if(nums[mid]<target)left=mid+1;
            if(nums[mid]>target)right=mid-1;
            if(nums[mid]==target)return mid;
        }
    
        return left;
    }
};

