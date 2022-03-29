 class Solution {
public:
    
    vector<vector<int>> res;
    
    void dfs(int idx,vector<int>& arr)
    {
        if (idx == arr.size())
        {
            vector<int> v;
            for (int i = 0,size = arr.size();i < size;i++) v.push_back(arr[i]);
            res.push_back(v);
            return;
        }
        
        for (int i = idx,size = arr.size(); i < size; i++)
        {
            swap(arr[i], arr[idx]);
            dfs(idx + 1,arr);
            swap(arr[i], arr[idx]);
        }
    }
    
    vector<vector<int>> XXX(vector<int>& nums)
    {
        dfs(0,nums);
        return res;
    }
};

