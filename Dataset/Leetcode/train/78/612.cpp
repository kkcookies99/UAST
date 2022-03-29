 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> result(1);
        for(int i=0;i<nums.size();i++){
            int size = result.size();
            for(int j=0;j<size;j++){
                vector<int> temp = result[j];
                temp.push_back(nums[i]);
                result.push_back(temp);
            }
        }
        return result;
    }
};

