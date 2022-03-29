 class Solution {
public:
    int XXX(vector<int>& nums, int target) {
        int left=0,right=nums.size()-1;
        int mid;
        while(left<=right){
            mid=(left+right)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }
};
code block

