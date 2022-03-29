 class Solution {
public:
    int XXX(vector<int>& nums) {
        int tail = -0x3fffffff, total = -0x3fffffff;
        for (int num : nums) {
            tail = max(tail + num, num);
            total = max(total, tail);
        }
        return total;
    }
};

