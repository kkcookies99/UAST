 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<int> tmp;
        vector<vector<int>> res;
        res.push_back(tmp);
        if(nums.size() == 0) return res;
        for(int i=0; i<nums.size(); i++){
            int n = res.size(); 
            for(int j=0; j<n; j++){
                vector<int> t = res[j];
                t.push_back(nums[i]);
                res.push_back(t);
            }
        }
        return res;
    }
};

