 class Solution {
public:
    string XXX(int num) {
        vector<string> store = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        vector<int> temp = {1000, 900, 500, 400, 100, 90,  50,  40, 10, 9, 5, 4, 1};
        string res;
        while(num){
            int i = 0;
            while(num < temp[i]){
                i ++;
            }
            num -= temp[i];
            res += store[i];
        }
        return res;
    }
};

