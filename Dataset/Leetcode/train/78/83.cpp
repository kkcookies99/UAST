class Solution {
public:
    void back(vector<int>& nums,vector<vector<int>>& res,vector<int> tmp,int index){
        res.push_back(tmp);//由于所有子集都要，所以不用判断返回条件
        for(int i=index;i<nums.size();i++){
            tmp.push_back(nums[i]);
            back(nums,res,tmp,i+1);
            tmp.pop_back();
        }
    }

    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> res;
        vector<int> tmp;
        back(nums,res,tmp,0);
        return res;
    }
};

