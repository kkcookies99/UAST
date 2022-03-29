class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> result;
        for(int i = 0;i<nums.size()+1;++i){
            combine(result,nums,i);
        }
        return result;
    }

private:
    void combine(vector<vector<int>>& result, vector<int>& nums, int k) {//产生元素个数为k的子集
        vector<int> temp;
        recur(result,temp,nums,0,k);
    }  

    void recur(vector<vector<int>>& result, vector<int>& temp, vector<int>& nums, int start, int k){
        if(!k){
            result.push_back(temp);
            return;
        }
        else{
            for(int cur = start;cur<nums.size()&&cur+k<nums.size()+1;++cur){
                temp.push_back(nums[cur]);
                recur(result,temp,nums,cur+1,k-1);
                temp.pop_back();
            }
        }
    }
};

