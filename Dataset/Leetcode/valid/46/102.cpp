class Solution {
public:
    vector<bool>used;
    vector<vector<int>>res;
    vector<int>s;
    void backtrack(vector<int>& nums,int j,vector<bool>& used){
        if(s.size()==nums.size()){
            res.push_back(s);
            return;
        }
        for(int i=0;i<nums.size();i++){
            if(!used[i]){
                used[i]=1;
                s.push_back(nums[i]);
                backtrack(nums,0,used);
                s.pop_back(); 
                used[i]=0;
            }
        }
    }
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<bool>used(nums.size()+1,0);
        backtrack(nums,0,used);
        return res;
    }
};

