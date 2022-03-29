class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        int n=nums.size();
        sort(nums.begin(),nums.end());
        vector<int>ans;
        vector<vector<int>>res;
        do{
            ans.clear();
            for(int i=0;i<n;i++){
                ans.push_back(nums[i]);
            }
            res.push_back(ans);
        }while(next_permutation(nums.begin(),nums.end()));
        return res;
    }
};

