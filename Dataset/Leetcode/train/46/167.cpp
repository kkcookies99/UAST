class Solution {
public:
    vector<vector<int> > result;
    void helper(int index,vector<int>& nums,int count){
        if(count == nums.size()){
            result.push_back(nums);
            return;
        }
        for (int i = index; i < nums.size(); ++i) {
            swap(nums[index],nums[i]);
            helper(index + 1,nums,count + 1);
            swap(nums[index],nums[i]);
        }
    }
    vector<vector<int>> XXX(vector<int>& nums) {
        helper(0,nums,0);
        return result;
    }
};

