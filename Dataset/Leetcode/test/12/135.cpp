 class Solution {
public:
    string XXX(int num) {
        string ret;
        int nums[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        const char *flags[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int count = sizeof(nums) / sizeof(int);
        for (int i = 0; i < count && num; i++) {
            for (int j = 0; j < num / nums[i]; j++) {
                ret.append(flags[i]);
            }
            num %= nums[i];
        }
        return ret;
    }
};

