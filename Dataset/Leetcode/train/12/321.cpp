 class Solution {
public:
    string XXX(int num) {
        if(num == 4) return "IV";
        if(num == 9) return "IX";
        if(num == 40) return "XL";
        if(num == 90) return "XC";
        if(num == 400) return "CD";
        if(num == 900) return "CM";
        const int number[7] = {1000, 500, 100, 50, 10, 5, 1};
        const string ch[7] = {"M", "D", "C", "L", "X", "V", "I"};
        string ans = "";
        int i;
        for(i = 0; num < number[i]; i++) {}
        while(num) {
            if(num >= 900 && num < 1000) {
                ans += "CM";
                num -= 900;
                continue;
            }
            else if(num >= 400 && num <500) {
                ans += "CD";
                num -= 400;
                continue;
            }
            else if(num >= 90 && num < 100) {
                ans += "XC";
                num -= 90;
                continue;
            }
            else if(num >= 40 && num < 50) {
                ans += "XL";
                num -= 40;
                continue;
            }
            else if(num == 9) {
                ans += "IX";
                break;
            }
            else if(num == 4) {
                ans += "IV";
                break;
            }
            else {
                int count = num / number[i];
                num = num % number[i];
                for(int j = 0; j < count; j++) ans += ch[i];
                i++;
            }  
        }
        return ans;
    }
};

