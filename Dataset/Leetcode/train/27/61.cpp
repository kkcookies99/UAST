 class Solution {
public:
    int XXX(vector<int>& nums, int val) {
        if(nums.size()==0)return 0;
        int l=0,r=0;
        while(r!=nums.size()){
            if(nums[r]!=val)nums[l++]=nums[r++];
            else r++;
        }
        return l;
    }
};

