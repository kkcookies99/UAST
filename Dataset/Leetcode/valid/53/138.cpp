class Solution {
public:
    int XXX(vector<int>& nums) {
        int n = nums[0], sum = nums[0];
        for(int i = 1 ; i<nums.size() ; i++){
            n = n>0?n+nums[i]:nums[i];
            if(sum<n) sum = n;
        }
        return sum;
    }
};

