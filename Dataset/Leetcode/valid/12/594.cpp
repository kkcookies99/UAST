 class Solution {
public:
    string XXX(int num) {
        string str = "";
        int tmp = num, i = 0;
        if (tmp >= 1000) {
            for (i = tmp / 1000; i; --i) str += "M";
            tmp %= 1000;
        }
        if (tmp >= 900) str += "CM",    tmp -= 900;
        if (tmp >= 500) str += "D",     tmp -= 500;
        if (tmp >= 400) str += "CD",    tmp -= 400;
        if (tmp >= 100) {
            for (i = tmp / 100; i; --i) str += "C";
            tmp %= 100;
        }
        if (tmp >= 90)  str += "XC",    tmp -= 90;
        if (tmp >= 50)  str += "L",     tmp -= 50;
        if (tmp >= 40)  str += "XL",    tmp -= 40;
        if (tmp >= 10) {
            for (i = tmp / 10; i; --i)  str += "X";
            tmp %= 10;
        }
        if (tmp >= 9)   str += "IX",    tmp -= 9;
        if (tmp >= 5)   str += "V",     tmp -= 5;
        if (tmp == 4)   str += "IV",    tmp -= 4;
        if (tmp) str.append(tmp, 'I');
        return str;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


