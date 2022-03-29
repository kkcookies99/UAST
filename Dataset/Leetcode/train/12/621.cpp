 class Solution {
public:
    string XXX(int num) {
        int numbers[] = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        string strs[] = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        string outS = "";
        while(num) {
            for (int i = 12; i >= 0; i --) {
                if (num >= numbers[i]) {
                    outS = outS + strs[i];
                    num -= numbers[i];
                    break;
                }
            }
        }
        return outS;
    }
};

