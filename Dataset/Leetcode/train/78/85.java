class Solution {
    vector<vector<int>> res;
    vector<int> ref;
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        ref=nums;
        vector<int> tmp={};
        traversal(tmp,0);
        return res;
    }
    void traversal(vector<int> tmp,int loc){
        if(tmp.size()<=ref.size()) res.push_back(tmp);
        for(int i=loc;i<ref.size();i++){
            tmp.push_back(ref[i]);
            traversal(tmp,i+1);
            tmp.pop_back();
        }
    }
};

