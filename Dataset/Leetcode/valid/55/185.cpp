class Solution {
public:
    bool XXX(vector<int>& nums) {
        int nLen = nums.size();
        int farstep = 0;
        for(int i = 0; i<nLen && i<=farstep; ++i){
            farstep = max(farstep,nums[i]+i);
        }
        return farstep>=(nLen-1);
    }
};

