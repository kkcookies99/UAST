class Solution {
public:

    void swap(vector<int> &nums, int l, int r){
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
    void process(vector<vector<int>> &vec, vector<int>& nums, int index){
        if(index == nums.size()){
            vec.push_back(nums);
        }else{
            for(int i = index; i<nums.size(); i++){
                swap(nums, i, index);
                process(vec, nums, index+1);
                swap(nums, i, index);
            }
        }
    }
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> res;
        if(nums.empty()){
            return res;
        }
        process(res, nums, 0);
        return res;
    }
};

