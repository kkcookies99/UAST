 class Solution {
public:
    void XXX(vector<int>& nums) {
        int i = 0;
        int j = 0;
        int k = nums.size() -1;
        while(j <= k){
            if(nums[j] < 1) {swap(nums[i], nums[j]); i++; j++; continue;}
            if(nums[j] == 1){j++; continue;}
            else{swap(nums[j], nums[k]); k--; continue;}
        }
    }
};

