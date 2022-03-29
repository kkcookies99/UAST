 class Solution {
public:
    string XXX(int num) {
        string res;
        res += string(num / 1000, 'M');
        num -= num / 1000 * 1000;
        if (num >= 900) {res += string("CM");num -= 900;}
        if (num >= 500) {res += string(num / 500, 'D');num -= num / 500 * 500;}
        if (num >= 400) {res += string("CD"); num -= 400;}
        res += string(num / 100, 'C');
        num -= num / 100 * 100;
        if (num >= 90) {res += string("XC");num -= 90;}
        if (num >= 50) {res += string(num / 50, 'L'); num -= num /50 * 50;}
        if (num >= 40) {res += string("XL"); num -= 40;}
        res += string(num / 10, 'X');
        num -= num / 10 * 10;
        if (num >= 9) return res += "IX";
        if (num >= 5) {res += string(num / 5, 'V'); num -= num /5 * 5;}
        if (num >= 4) return res += "IV";
        return res += string(num, 'I');
    }
};

