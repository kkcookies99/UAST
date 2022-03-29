 class Solution {
public:
    bool XXX(vector<int>& nums) {
       int n=nums.size();
       for(int i=0,j=0;i<n;i++){
           if(j<i)return false;
           j=max(j,i+nums[i]);
       }
       return true;
    }
};

