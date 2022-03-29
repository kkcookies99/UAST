 class Solution {
public:
    string XXX(int num) {
        int thou, hun, ten, one;
        string ret;
        thou = num /1000;
        if(thou > 0){
            for(int i = 0; i <thou; i++)
                ret +='M';
            num = num - 1000 * thou;
        }

        hun = num / 100;
        if(hun == 9) ret += "CM";
        else if(hun >= 5){
            ret += "D";
            int tmp = hun % 5;
            for(int i = 0; i < tmp; i++){
                ret +="C";
            }
        }
        else if(hun == 4) ret += "CD";
        else{
            for(int i = 0; i < hun; i++){
                ret += 'C';
            }
        }
        num = num - 100 * hun;

        ten = num /10;
        if(ten == 9) ret += "XC";
        else if(ten >= 5){
            ret += 'L';
            int tmp = ten % 5;
            for(int i = 0; i < tmp; i++){
                ret += 'X';
            }
        }
        else  if(ten == 4) ret += "XL";
        else{
            for(int i = 0; i < ten; i++){
                ret += 'X';
            }
        }
        num = num - 10 * ten;

        one = num;
        if(one == 9) ret += "IX";
        else if(one >= 5){
            ret += 'V';
            int tmp = one % 5;
            for(int i = 0; i < tmp; i++){
                ret += 'I';
            }
        }
        else if(one == 4) ret += "IV";
        else{
            for(int i = 0; i < one; i++){
                ret += 'I';
            }
        }
        return ret;
    }
};

