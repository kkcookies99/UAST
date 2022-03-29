 class Solution {
public:
    vector<int> path;
    vector<vector<int>> res;
    vector<vector<int>> XXX(vector<int>& nums) {
        dfs(nums);
        return res;
    }

    void dfs(vector<int>& nums)
    {
        if(path.size() == nums.size())
        {
            if(is_permutation(path)) res.push_back(path);
            return;    
        }else {
            if(!is_permutation(path)) return;    
        }
        for(int i = 0; i < nums.size(); i ++)
        {
            path.push_back(nums[i]);
            dfs(nums);
            path.pop_back();
        }
    }

    bool is_permutation(vector<int>& path)
    {
        set<int> rec;
        for(int i = 0; i < path.size(); i ++)
        {
            if(rec.count(path[i])) return false;
            rec.insert(path[i]);
        }
        return true;    
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


