class Solution {
public:
    vector<vector<int>> ans;
    vector<int> temp;
    void sub(vector<int> s){
        ans.push_back(temp);
        while(s.size()){
            temp.push_back(s[0]);
            s.erase(s.begin());
            sub(s);
            temp.pop_back();
        }
    }
    vector<vector<int>> XXX(vector<int>& nums) {
        sub(nums);
        return ans;
    }
};

