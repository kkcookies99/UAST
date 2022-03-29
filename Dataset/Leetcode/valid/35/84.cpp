 class Solution {
public:
    int XXX(vector<int>& nums, int target) {
        if(target<nums[0]) return 0;

           for(int i=0;i<nums.size();i++){
                 if(nums[i]<target) {continue;}
                 else return i;
           }
        return nums.size();
    }
};

