class Solution {
public:
    vector<vector<int>> res;
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<int> vec;
        getSubsets(nums,0,vec);
        return res;
    }
    void getSubsets(vector<int> nums,int begin,vector<int> vec){
        res.push_back(vec);
        for(int i=begin;i<nums.size();i++){
            vec.push_back(nums[i]);
            getSubsets(nums,i+1,vec);
            vec.pop_back();
        }
    }
};

