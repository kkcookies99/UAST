 class Solution {
public:
    vector<vector<int>> res;
    vector<int> path;
    map<int, int> hash;

    vector<vector<int>> XXX(vector<int>& nums) {
        dfs(0, nums.size(), nums); 

        return res;
    }

    void dfs(int index, int n, vector<int>& nums){
        if(index == n){
            res.push_back(path);
            return;
        }

        for(int i = 0; i < n; i++){
            if(hash[i] < 1){
                path.push_back(nums[i]);
                hash[i]++;
                dfs(index + 1, n, nums);
                hash[i]--;
                path.pop_back();
            }
        }
    }
};

