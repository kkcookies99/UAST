 class Solution {
public:
    const int idx[13] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    const string roma[13] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    string XXX(int num) {

        string res = "";
        for(int i = 0; i<13; ++i){
            while(num >= idx[i]){
                res += roma[i];
                num -= idx[i];
            }
        }
        return res;
    }
};

