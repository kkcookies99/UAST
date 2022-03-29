 class Solution {
public:
    int XXX(vector<int>& nums, int val) {
        int slowPoint = 0, fastPoint = 0, len = nums.size();
        while (slowPoint < len && nums[slowPoint] != val){
            slowPoint++;
        }
        if (slowPoint == len) {
            return len;
        }
        fastPoint = slowPoint + 1;
        while (fastPoint < len && nums[fastPoint] == val) {
            fastPoint++;
        }
        if (fastPoint == len) {
            return slowPoint;
        }
        while (slowPoint < len && fastPoint < len) {
            nums[slowPoint++] = nums[fastPoint++];
            if (nums[fastPoint] == val) {
                fastPoint++;
            }
        }
        return slowPoint;
    }
};

