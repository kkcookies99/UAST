class Solution {
public:
    vector<vector<int>>res;
    vector<int>temp;
    vector<vector<int>> XXX(vector<int>& nums) {
        res.push_back(vector<int>());
        for(int i=0;i<nums.size();i++){
            int size=res.size();
            for(int j=0;j<size;j++){
                vector<int>temp=res[j];
                temp.push_back(nums[i]);
                res.push_back(temp);
            }
        }
        return res;
    }
};

