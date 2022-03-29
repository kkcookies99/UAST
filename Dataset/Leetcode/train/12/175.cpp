 class Solution {
public:
    string XXX(int num) {
        vector<string> symbol = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        vector<int> lst = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        string ans = "";
        int i = 0;
        while (num) {
            if (num >= lst[i]) {
                num -= lst[i];
                ans += symbol[i];
            } else i++;
        }
        return ans;
    }
};

