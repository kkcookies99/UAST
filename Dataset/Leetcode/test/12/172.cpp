 class Solution {
public:
    string XXX(int num) {
        string ans = "";
        /*
        map<int, string> intToma = {
            {1, "I"}, {5, "V"}, {10, "X"}, {50, "L"}, {100, "C"}, {500, "D"}, {1000, "M"}, 
            {4, "IV"}, {9, "IX"}, {40, "XL"}, {90, "XC"}, {400, "CD"}, {900, "CM"}
        };
        */
        while(num > 0){
            if(num >= 1000){
                ans += "M";
                num -= 1000;
            }
            else if(num >= 900){
                ans += "CM";
                num -= 900;
            }
            else if(num >= 500){
                ans += "D";
                num -= 500;
            }
            else if(num >= 400){
                ans += "CD";
                num -= 400;
            }
            else if(num >= 100){
                ans += "C";
                num -= 100;
            }
            else if(num >= 90){
                ans += "XC";
                num -= 90;
            }
            else if(num >= 50){
                ans += "L";
                num -= 50;
            }
            else if(num >= 40){
                ans += "XL";
                num -= 40;
            }
            else if(num >= 10){
                ans += "X";
                num -= 10;
            }
            else if(num >= 9){
                ans += "IX";
                num -= 9;
            }
            else if(num >= 5){
                ans += "V";
                num -= 5;
            }
            else if(num >= 4){
                ans += "IV";
                num -= 4;
            }
            else if(num >= 1){
                ans += "I";
                num -= 1;
            }
        }
        return ans;
    }
};

