 class Solution {
public:
    int XXX(vector<int>& nums, int target) {
        if(nums.size()==0){
            return 0;
        }
        if(nums[0]>=target){
            return 0;
        }
        if(nums[nums.size()-1]<target){
            return nums.size();
        }

        int i=0, j=nums.size()-1, mid=0;
        while(i<j){
            mid = (i+j)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                i = mid+1;
            }
            else{
                j = mid;
            }
        }

        if(nums[mid]<=target){
            return mid+1;
        }
        return mid;
    }
};

