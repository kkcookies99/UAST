class Solution {
public:
    bool XXX(vector<int>& nums) {
        int n=nums.size(),r=0;
        for(int i=0;i<n-1;i++){
            if(r==i&&!nums[i]) return false;
            r=max(r,i+nums[i]);
        }

        return (r>=n-1)?true:false;
    }
};

