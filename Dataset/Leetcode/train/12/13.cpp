 class Solution {
public:
    string XXX(int num)
    {
        int val[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        string roma[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        string res;
        for (int i = 0; num > 0; ++i) {
            while (num >= val[i]) {
                num -= val[i];
                res += roma[i];
            }
        }
        return res;
    }
};

