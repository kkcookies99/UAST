 class Solution {
public:
    string XXX(int n) {
        vector<string> roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        vector<int> nums {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        string res;
        for (int i = 0; i < nums.size(); ++ i) {
            while (n >= nums[i]) {
                n -= nums[i];
                res += roman[i];
            }
        }
        return res;
    }
};

