 class Solution {
public:
    string XXX(int num) {
        vector<int> d{1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        vector<string> s{"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        string ans;
        while(num){
            int idx = upper_bound(d.begin(), d.end(), num) - d.begin() - 1;
            ans += s[idx];
            num -= d[idx];
        }
        return ans;
    }
};

