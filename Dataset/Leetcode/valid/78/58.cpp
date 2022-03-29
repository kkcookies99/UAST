class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
         int n = nums.size();
         vector<int>tmp;
         vector<vector<int>>ans;
         int sum = 1<<n;
         for(int i=0;i<sum;i++){
             for(int j=0;j<n;j++){
                 if(i&(1<<j))tmp.push_back(nums[j]);
             }
             ans.push_back(tmp);
             tmp.clear();
         }
         return ans;
    }
};


