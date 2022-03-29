 class Solution {
public:
    string XXX(int num)
    {
        string res = "";
        int k;
        if (num >= 1000) {
            k = num / 1000;
            res += string(k, 'M');
            num %= 1000;
        }
        if (num >= 100) {
            k = num / 100;
            if (k == 9) {
                res += "CM";
            } else if (k == 4) {
                res += "CD";
            } else {
                if (k >= 5) {
                    res += "D";
                    k -= 5;
                }
                res += string(k, 'C');
            }
            num %= 100;
        }
        if (num >= 10) {
            k = num / 10;
            if (k == 9) {
                res += "XC";
            } else if (k == 4) {
                res += "XL";
            } else {
                if (k >= 5) {
                    res += "L";
                    k -= 5;
                }
                res += string(k, 'X');
            }
            num %= 10;
        }
        if (num >= 1) {
            k = num;
            if (k == 9) {
                res += "IX";
            } else if (k == 4) {
                res += "IV";
            } else {
                if (k >= 5) {
                    res += "V";
                    k -= 5;
                }
                res += string(k, 'I');
            }
        }
        return res;
    }
};

