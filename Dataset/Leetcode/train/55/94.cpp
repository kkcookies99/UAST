class Solution {
public:
    bool XXX(vector<int>& nums) {
        int n=nums.size();
        int maxreach=0;
        for(int i=0;i<n;i++){
            if(i>maxreach) break;
            if(maxreach<i+nums[i]) maxreach=i+nums[i];
            if(maxreach>=n-1) return true;
        }
        return false;
    }
};

