class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> ans;
        if(nums.size()==0){
            vector<int> tmp;
            ans.push_back(tmp);
            return ans;
        }
        int back=nums.back();
        nums.pop_back();
        vector<vector<int>> ans1=XXX(nums);
        for(vector<int> i:ans1){
            vector<int> tmp=i;
            tmp.push_back(back);
            ans.push_back(tmp);
            ans.push_back(i);
        }
        return ans;
    }
};

