 class Solution {
public:
    int XXX(vector<int>& nums) {
        int index=0;
        if(nums.size()==0) return 0;
        for(int i=1;i<nums.size();i++){
            if(nums[i]!=nums[index]) nums[++index]=nums[i];
        }
        return index+1;
    }
};

