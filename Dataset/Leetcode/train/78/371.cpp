class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {

        vector<vector<int>> ans{};
        vector<vector<int>>temp{};
        int n = nums.size();
        ans.push_back(vector<int>());
        temp.push_back(vector<int>());

        for(int i = 0; i< n; i++)
        {
            for(int j = 0; j< temp.size(); j++)
            {temp[j].push_back(nums[i]);
              ans.push_back(temp[j]);
            }
            temp.clear();
            temp = ans;
        }
        return ans;
            


    }
};

