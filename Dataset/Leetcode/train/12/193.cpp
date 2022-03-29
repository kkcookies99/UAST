 class Solution {
public:
    string XXX(int num) {
        string roman;
        while (num) {
            if (num >= 1000) {
                roman = roman + 'M';
                num -= 1000;
            } else if (num >= 900) {
                roman += "CM";
                num -= 900;
            } else if (num >= 500) {
                roman = roman + 'D';
                num -= 500;
            } else if (num >= 400) {
                roman += "CD";
                num -= 400;
            } else if (num >= 100) {
                roman = roman + 'C';
                num -= 100;
            } else if (num >= 90) {
                roman += "XC";
                num -= 90;
            } else if (num >= 50) {
                roman = roman + 'L';
                num -= 50;
            } else if (num >= 40) {
                roman += "XL";
                num -= 40;
            } else if (num >= 10) {
                roman = roman + 'X';
                num -= 10;
            } else if (num >= 9) {
                roman += "IX";
                num -= 9;
            } else if (num >= 5) {
                roman = roman + 'V';
                num -= 5;
            } else if (num >= 4) {
                roman += "IV";
                num -= 4;
            } else if (num >= 1) {
                roman = roman + 'I';
                num -= 1;
            }
        }
        return roman;
    }
};

