class Solution {
public:
    bool XXX(vector<int>& nums) {
        int canreach=0,n=nums.size();
        for(int i=0;i<n;i++){
            if(i>canreach)return false;
            canreach=max(canreach,i+nums[i]);
            if(canreach>=n-1)return true;
        }
        return true;//应付编译器的，这行没用，永远不会执行到这
    }
};

