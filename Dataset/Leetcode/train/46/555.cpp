 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> res;
        dfs(res, 0, nums);
        return res;
        
    }
    void dfs(vector<vector<int>> &res, int st, vector<int> nums){
        if(st == nums.size() - 1){
            res.push_back(nums);
            return ;
        }
        
        for(int i=st; i<nums.size(); i++){

            swap(nums[i], nums[st]);

            dfs(res, st+1, nums);

            swap(nums[i], nums[st]);

        }
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


