 class Solution {
    string ans = "";
public:
    string XXX(int num) {
        while (num) {
            if (num >= 1000) {
                num -= 1000;
                ans.push_back('M');
            } else if (num >= 900) {
                num -= 900;
                ans += "CM";
            } else if (num >= 500) {
                num -= 500;
                ans.push_back('D');
            } else if (num >= 400) {
                num -= 400;
                ans += "CD";
            } else if (num >= 100) {
                num -= 100;
                ans.push_back('C');
            } else if (num >= 90) {
                num -= 90;
                ans += "XC";
            } else if (num >= 50) {
                num -= 50;
                ans.push_back('L');
            } else if (num >= 40) {
                num -= 40;
                ans += "XL";
            } else if (num >= 10) {
                num -= 10;
                ans.push_back('X');
            } else if (num >= 9) {
                num -= 9;
                ans += "IX";
            } else if (num >= 5) {
                num -= 5;
                ans.push_back('V');
            } else if (num >= 4) {
                num -= 4;
                ans += "IV";
            } else {
                num--;
                ans.push_back('I');
            }
        }
        return ans;
    }
};

