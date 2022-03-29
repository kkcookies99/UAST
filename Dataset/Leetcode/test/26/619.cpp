 class Solution {
public:
    int XXX(vector<int>& nums) {
        int len = int(nums.size());
        int front_ptr = 0;  // 前向试探指针
        int back_ptr = 0;   // 后向答案指针
        while (front_ptr < len) {
            while (front_ptr + 1 < len && nums[front_ptr] == nums[front_ptr+1]) {
                ++front_ptr;
            }
            nums[back_ptr] = nums[front_ptr];
            ++back_ptr;
            ++front_ptr;
        }
        return back_ptr;
    }
};

