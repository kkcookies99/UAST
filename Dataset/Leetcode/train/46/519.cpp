 class Solution {
public:
vector<vector<int> > res;
vector<int> tmp;//暂时存储一种排列组合
map<int, bool> sign_map;//标记nums的第n位置的数是否已经使用过
int N;
    vector<vector<int>> XXX(vector<int>& nums) {
        N = nums.size();
        backTrack(nums);
        return res;
    }
    void backTrack(vector<int>& nums){
        if (tmp.size() == N){//当前的长度已经符合要求
            res.push_back(tmp);
            return;
        }
        for(int i = 0;i < nums.size(); ++i){
            if(sign_map[i] != 1){
                tmp.push_back(nums[i]);
                sign_map[i]= 1;//设置标记,第n位置的数已经使用过
                backTrack(nums);
                tmp.pop_back();
                sign_map[i] = 0;//设置标记
            }
        }
    }
};```

