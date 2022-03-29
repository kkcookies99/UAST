 class Solution {
    public String XXX(int num) {
        int K = num/1000;  num = num%1000;
        int H = num/100;  num = num%100;
        int TEN = num/10;
        int IND = num%10;

        String ans = "";
        for(int i=0;i<K;i++)  ans += "M";
        
        if(H==9)  ans += "CM";
        else if(H<9 && H>=5){
            ans += "D";
            for(int i=0;i<H-5;i++) ans += "C";
        }
        else if(H==4)  ans += "CD";
        else if(H<4)  for(int i=0;i<H;i++) ans += "C";

        if(TEN==9)  ans += "XC";
        else if(TEN<9 && TEN>=5){
            ans += "L";
            for(int i=0;i<TEN-5;i++) ans += "X";
        }
        else if(TEN==4)  ans += "XL";
        else if(TEN<4)  for(int i=0;i<TEN;i++) ans += "X";    

        if(IND==9)  ans += "IX";
        else if(IND<9 && IND>=5){
            ans += "V";
            for(int i=0;i<IND-5;i++) ans += "I";
        }
        else if(IND==4)  ans += "IV";
        else if(IND<4)  for(int i=0;i<IND;i++) ans += "I";
        
        return ans;    
    }
}

