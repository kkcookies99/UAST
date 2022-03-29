 class Solution {
public:
    string XXX(int num) {
        string ans = "";
        int n[13] = {1000, 900, 500, 400,100,90,50,40,10,9,5,4,1};
        string s[13] = {"M", "CM", "D", "CD", "C", "XC","L", "XL", "X", "IX", "V", "IV", "I"};
        for (int i = 0; i < 13; i++) {
            int tmp = n[i];
            n[i] = num / tmp;
            num %= tmp;
            for (int j = 0; j < n[i]; j++) {
                ans = ans + s[i];
            }
        }
        return ans;
    }
};

