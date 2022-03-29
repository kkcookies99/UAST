 class Solution {
public:
    int XXX(vector<int>& nums, int val) {
        int length = nums.size();
        int pos = 0;
        for (int i = 0; i < length; i++){
            if (nums[i] != val) nums[pos++] = nums[i]; 
        }
        return pos;  
    }
};

