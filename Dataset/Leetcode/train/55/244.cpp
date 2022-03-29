class Solution {
public:
    bool XXX(vector<int>& nums) {
        if(nums.size()==1){
            return true;
        }
        int temp = nums[0];
        int max_ans = temp;
        for(int i=1;i<nums.size()&&max_ans>=i;++i){
            temp = max(temp,nums[i]+i);
            max_ans = max(temp, max_ans);
            if(max_ans>=nums.size()-1){
                return true;
            }
        }
        return false;
    }
};

