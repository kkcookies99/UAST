 class Solution {
public:
    int XXX(vector<int>& nums) {
        int size=nums.size();
        if(size<2)return size;
        int fast=0,low=0;
        while(fast<size-1){
            if(nums[fast+1]==nums[low])fast++;
            else{
            low++;
            nums[low]=nums[fast+1];
            fast++;
            }
        }
        return low+1;
    }
};

