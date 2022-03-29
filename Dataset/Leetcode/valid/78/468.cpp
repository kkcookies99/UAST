 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> res;
        vector<int> temp; res.push_back(temp);
        for(auto i = nums.begin();i != nums.end();i++) {
            int size = res.size();
            for(int j = 0;j < size;j++) {
                temp = res[j]; 
                temp.push_back(*i);
                res.push_back(temp);
            }
        }
        return res;
    }
};

