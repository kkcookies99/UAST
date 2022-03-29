class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> res;
        vector<int> temp;
        res.push_back(temp);
        for(int i=0;i<nums.size();i++){
            int num=res.size();
            for(int j=0;j<num;j++){
                temp=res[j];
                temp.push_back(nums[i]);
                res.push_back(temp);
            }
        }
        return res;
    }
};

