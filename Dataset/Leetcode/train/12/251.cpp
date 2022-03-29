 class Solution {
public:
    string XXX(int num) {
        string res = "";
        vector<int> val = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        vector<string> roma = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int index = 0; 
        while(index < 13){
            while(num >= val[index]){
                num -= val[index];
                res += roma[index];
            }
            index++;
        }
        return res;
    }
};

