 class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int s = nums.size();
        int v = 0;
        for (int i=0; i<s; i++) {
            v ^= nums[i];
        }
        //printf("v:%d\n", v);
        return v;
    }
};

