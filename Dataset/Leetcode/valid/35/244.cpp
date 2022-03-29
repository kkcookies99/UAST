 class Solution {
public:
    int XXX(vector<int>& nums, int target) {
        int left=0,right=nums.size()-1,mid;
        while(left<right){
            mid=left+(right-left)/2;
            if(nums[mid]>target){
                right =mid-1;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                return mid;
            }
        }
        if(target>nums[left]){
            return left+1;
        }
        else{
            return left;
        }
    }
};

