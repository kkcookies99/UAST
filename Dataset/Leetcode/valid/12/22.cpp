 class Solution {
private:
    vector<string> ts = {"", "M", "MM", "MMM"};
    vector<string> hs = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    vector<string> te = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    vector<string> os = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

public:
    string XXX(int num) {
        return ts[num / 1000] + hs[num / 100 % 10] + te[num / 10 % 10] + os[num % 10];
    }
};

