class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>>res;
        vector<int>empty;
        res.push_back(empty);
        for(int temp:nums){
            int cur=res.size();
            for(int i=0;i<cur;i++){
                vector<int>vtemp=res[i];
                vtemp.push_back(temp);
                res.push_back(vtemp);
            }
        }
        return res;
    }
};

