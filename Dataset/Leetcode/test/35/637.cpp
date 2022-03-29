 class Solution {
public:
    int XXX(vector<int>& nums, int target) {
        int len = nums.size();
        int index = 0;
        while(index<len){
            if(nums[index]>=target) return index;
            else index++; 
        }
        if(len==0) return 0;
        return index;
    }
};

