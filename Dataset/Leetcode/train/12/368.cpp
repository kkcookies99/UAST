 class Solution {
public:
    string XXX(int num) {
        string res="";
        if(num>=1000){
            for(int i=0;i<num/1000;i++)
                res+="M";
            num%=1000;
        }
        if(num>=100){
            if(num/100==4)
                res+="CD";
            else if(num/100==9)
                res+="CM";
            else{
                if(num/100>=5){
                    res+="D";
                    for(int i=0;i<num/100-5;i++)
                        res+="C";
                }
                else{
                    for(int i=0;i<num/100;i++)
                        res+="C";
                }
            }
            num%=100;
        }
        if(num>=10){
            if(num/10==4)
                res+="XL";
            else if(num/10==9)
                res+="XC";
            else{
                if(num/10>=5){
                    res+="L";
                    for(int i=0;i<num/10-5;i++)
                        res+="X";
                }
                else{
                    for(int i=0;i<num/10;i++)
                        res+="X";
                }
            }
            num%=10;
        }
        if(num<10){
            if(num==4)
                res+="IV";
            else if(num==9)
                res+="IX";
            else{
                if(num>=5){
                    res+="V";
                    for(int i=0;i<num-5;i++)
                        res+="I";
                }
                else{
                    for(int i=0;i<num;i++)
                        res+="I";
                }
            }
        }
        return res;
    }
};

