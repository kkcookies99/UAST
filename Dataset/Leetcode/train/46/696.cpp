 class Solution {
public:
    void _swap(vector<int>& nums, int i, int j){
        if(i != j){
            nums[i] = nums[i]^nums[j];
            nums[j] = nums[i]^nums[j];
            nums[i] = nums[i]^nums[j];
        }
    }

    void _premute(vector<int>& nums, int k, vector<vector<int>>& ret){
        if(k == nums.size()){
            ret.push_back(nums);
            return;
        }
        
        for(int i = k - 1; i < nums.size(); i++){
            _swap(nums, k - 1, i);
            _premute(nums, k+1, ret);
            _swap(nums, k-1 , i);
        }
    }

    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> ret;
        _premute(nums,1,ret);
        return ret;
    }

   

};

