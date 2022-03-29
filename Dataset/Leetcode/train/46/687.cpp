 class Solution {
public:
    void helper (vector<int>& path, int index , 
                 vector<vector<int>>& result) {
     if (path.size() == index) {
       result.push_back(path);
       return;
     }
     for (int i = index; i < path.size(); ++i) {
        swap(path[i], path[index]);
        helper(path, index + 1, result);
        swap(path[i], path[index]);
     }
    }

    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> result;
        helper(nums, 0, result);
        return result;
    }
};```

