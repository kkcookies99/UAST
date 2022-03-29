 class Solution {
public:
    string XXX(int num) {
        int M = num/1000;
        num = num%1000;
        int D = num/500;
        num = num%500;
        int C = num/100;
        num = num%100;
        int L = num/50;
        num = num%50;
        int X = num/10;
        num = num%10;
        int V = num/5;
        num = num%5;
        int I = num;
        string output = "";

        for(int i = 0;i < M;i++){
            output += "M";
        }
        if(D == 1&& C == 4){
            output += "CM";
        }
        else{
            if(D == 1){
                output += "D";
            }
            if(C == 4){
                output += "CD";
            }
            else{
                for(int i = 0;i < C;i++){
                    output += "C";
                }
            }
        }
        if(L == 1&& X == 4){
            output += "XC";
        }
        else{
            if(L == 1){
                output += "L";
            }
            if(X == 4){
                output += "XL";
            }
            else{
                for(int i = 0;i < X;i++){
                    output += "X";
                }
            }
        }
        if(V == 1&& I == 4){
            output += "IX";
        }
        else{
            if(V == 1){
                output += "V";
            }
            if(I == 4){
                output += "IV";
            }
            else{
                for(int i = 0;i < I;i++){
                    output += "I";
                }
            }
        }
        return output;
    }
};

