 class Solution {
public:
    string XXX(int num) {
        int one,ten,hundred,thousand = 0;
        int n[4] = {0};
        int i =0;
        string res;
        string ones,tens,hundreds,thousands;
        int number = num;
        while(number != 0)
        {
            n[i] = number % 10;
            number = number / 10;
            i++;
        }
        one      = n[0];
        ten      = n[1];
        hundred  = n[2];
        thousand = n[3];
        if(one == 4)
            ones = "IV";
        else if(one == 9)
            ones = "IX";
        else if(one < 4){
            int i = one;
            while(i != 0){
            ones += "I";
            i--;
            }
        }
        else if (5 <= one &&one < 9){
            int i = one - 5;
            ones ="V";
            while(i != 0){
            ones += "I";
            i--;
            }
        }
        else ones = "";
        

        if(ten == 4)
            tens = "XL";
        else if (ten == 9)
            tens = "XC";
        else if (ten < 4){
            int i = ten;
            while(i != 0){
            tens += "X";
            i--;
            }
        }
        else if (5 <= ten&& ten < 9){
            int i = ten - 5;
            tens ="L";
            while(i != 0){
            tens += "X";
            i--;
            }
        }
        else tens = "";

        if(hundred == 4)
            hundreds = "CD";
        else if (hundred == 9)
            hundreds = "CM";
        else if (hundred < 4){
            int i = hundred;
            while(i != 0){
            hundreds += "C";
            i--;
            }
        }
        else if (5 <= hundred && hundred < 9){
            int i = hundred - 5;
            hundreds ="D";
            while(i != 0){
            hundreds += "C";
            i--;
            }
        }
        else hundreds = "";
        
        if (0 < thousand){
            int i = thousand;
            while(i != 0){
            thousands += "M";
            i--;
            }
        }
        else thousands = "";

        res = thousands + hundreds + tens + ones;
        return res;
    }
};

