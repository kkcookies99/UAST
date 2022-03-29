 class Solution {
public:
    void XXX(vector<int>& nums) {
        if (nums.size() == 1 || nums.size() == 0)   return;
        int end = nums.size() - 1;
        int i = 0, start = 0;
        while (i <= end){
            if (nums[i] == 0){
                nums[i] = 1;
                nums[start] = 0;
                ++i;
                ++start;
            }
            else if (nums[i] == 2){
                nums[i] = nums[end];
                nums[end] = 2;
                --end;
            }
            else i++;
        }
    }
};

