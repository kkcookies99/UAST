class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>>res;
        vector<int>temp=nums;
        do{
            res.push_back(temp);
            next_permutation(temp.begin(),temp.end());
        }while(temp!=nums);
        return res;
    }
};

