 class Solution {
public:
    string XXX(int num) {
        string res = "";
        vector<int> val = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        vector<string> roma = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        while(num != 0){
            int pos;
            for(int i = 0; i < val.size(); i++){
                if(num - val[i] >= 0){
                    num -= val[i];
                    pos = i;
                    break;
                }
            }
            res += roma[pos];
        }
        return res;
    }
};

