class Solution {
private:
    vector<vector<int>> ans;
    void backtrack(vector<vector<int>>& ans, vector<int>& vec,int first, int size){
        if(first==size){
            ans.push_back(vec);
            return;
        }
        for(int i=first;i<size;i++){
            // for循环保证任意两个位置的数可以被交换
            swap(vec[i],vec[first]);
            backtrack(ans,vec,first+1,size);
            swap(vec[i],vec[first]);
            
        }
    }
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        // 回溯法
        vector<int> tmp;
        backtrack(ans,nums,0,nums.size());
        return ans;
    }
};

