 class Solution {
public:
    string XXX(int num) {
        int nums[13] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        string romas[13] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        int idx = 0;
        string result;
        while (num > 0) {
            for (int i = idx; i < 13;) {
                if (num >= nums[i]) {
                    result += romas[i];
                    num -= nums[i];
                } else {
                    i++;
                }
                idx = i;
            }
        }
        return result;
    }
};

