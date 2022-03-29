 class Solution {
public:
    string XXX(int num) {
        string res = "";
        if (num >= 1000){
            int thousandPlace = num / 1000 % 10;
            while (thousandPlace-- >= 1){
                res += "M";
            }
        }
        if (num >= 100){
            int hundredPlace = num / 100 % 10;
            if (hundredPlace >= 5 and hundredPlace < 9){
                res += "D";
                while(--hundredPlace >= 5){
                    res += "C";
                }
            } else if (hundredPlace == 9){
                res += "CM";
            } else if (hundredPlace == 4){
                res += "CD";
            } else {
                while (hundredPlace-- >= 1){
                    res += "C";
                }
            }
        }

        if (num >= 10){
            int tenPlace = num / 10 % 10;
            if (tenPlace >= 5 and tenPlace < 9){
                res += "L";
                while(--tenPlace >= 5){
                    res += "X";
                }
            } else if (tenPlace == 9){
                res += "XC";
            } else if (tenPlace == 4){
                res += "XL";
            } else {
                while (tenPlace-- >= 1){
                    res += "X";
                }
            }
        }
        int unitPlace = num / 1 % 10;
        if (unitPlace >= 5 and unitPlace < 9){
            res += "V";
            while(--unitPlace >= 5){
                res += "I";
            }
        } else if (unitPlace == 9){
            res += "IX";
        } else if (unitPlace == 4){
            res += "IV";
        } else {
            while (unitPlace-- >= 1){
                res += "I";
            }
        }
        return res;
    }
};

