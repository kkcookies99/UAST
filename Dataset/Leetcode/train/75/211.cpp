class Solution {
public:
    void XXX(vector<int>& nums) {
        int tmp;
        for (int i; i<nums.size(); i++) {
            for (int j=nums.size()-1; j>=i && j>=1; --j) {
                if (nums[i] > nums[j]) {
                    tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }     
    }
};

