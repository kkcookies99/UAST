 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> res;  
        int n = 1<<nums.size();
        for(int i=0; i<n; i++){// 每个i的二进制，都代表一种选择
            vector<int > t;
            int k = nums.size()-1;
            int tmp_i = i;
            while(tmp_i>0){
                if(tmp_i&1>0){
                    t.push_back(nums[k]);
                }
                k--;
                tmp_i = tmp_i>>1;
            }
            res.push_back(t);
        }
        return res;
    }
};

