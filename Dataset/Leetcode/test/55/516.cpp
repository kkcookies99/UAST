 class Solution {
public:
    bool XXX(vector<int>& nums) {
        if(nums.size()==1) return true;
        int cover=0;
        for(int i=0;i<=cover;i++){
            cover=max(cover,i+nums[i]);
            if(cover>=nums.size()-1) return true;
        }
        return false;
    }
};


