class Solution {
public:
    void XXX(vector<int>& nums) {
        if(nums.empty()) return;
        int l = 0;
        int r = nums.size() - 1;
        for(int i = l; i <= r; i++){
            if(nums[i] == 0){
                swap(nums[l++], nums[i]);
            }else if(nums[i] == 2){
                swap(nums[i--], nums[r--]);
            }
        }
    }
};

