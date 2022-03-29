 class Solution {
public:
    vector<string> a = {"", "I", "II", "III", "IV", "V", "VI","VII","VIII","IX"};
    vector<string> b = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    vector<string> c = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    vector<string> d = {"", "M", "MM", "MMM"};
    string XXX(int num) {
        int di = num / 1000;
        num = num % 1000;
        int ci = num / 100;
        num = num % 100;
        int bi = num / 10;
        num = num % 10;
        int ai = num;
        return d[di] + c[ci] + b[bi] + a[ai];
    }
};

