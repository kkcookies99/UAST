 class Solution {
public:
    string XXX(int num) {
        string res;
        if(num >= 1000){
            int cnt = num / 1000;
            for(int i = 0; i < cnt; ++i) res += "M";
            num -= cnt * 1000;
        }
        if(num >= 900){
            res += "CM";
            num -= 900;
        }
        if(num >= 500){
            res += "D";
            num -= 500;
        }
        if(num >= 400){
            res += "CD";
            num -= 400;
        }
        if(num >= 100){
            int cnt = num / 100;
            for(int i = 0; i < cnt; ++i) res += "C";
            num -= cnt * 100;
        }
        if(num >= 90){
            res += "XC";
            num -= 90;
        }
        if(num >= 50){
            res += "L";
            num -= 50;
        }
        if(num >= 40){
            res += "XL";
            num -= 40;
        }
        if(num >= 10){
            int cnt = num / 10;
            for(int i = 0; i < cnt; ++i) res += "X";
            num -= cnt * 10;
        }
        if(num >= 9){
            res += "IX";
            num -= 9;
        }
        if(num >= 5){
            res += "V";
            num -= 5;
        }
        if(num >= 4){
            res += "IV";
            num -= 4;
        }
        if(num >= 1){
            int cnt = num / 1;
            for(int i = 0; i < cnt; ++i) res += "I";
        }
        return res;
    }
};```

