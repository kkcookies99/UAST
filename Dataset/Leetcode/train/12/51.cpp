 class Solution {
public:
    string XXX(int num) {
        string s="";
        int remain,n;
        remain=num;
        n=remain/1000;
        remain=remain%1000;
        for(int i=0;i<n;i++) s+="M";
        n=remain/100;
        remain=remain%100;
        if (n==9) s+="CM";
        if (n>=5 &&n<=8) {
            s+="D";
            for(int i=5;i<n;i++){
                s+="C";
            }
        }
        if (n==4){
            s+="CD";
        }
        if (n>=1&&n<=3){
            for(int i=0;i<n;i++){
                s+="C";
            }
        }
        n=remain/10;
        remain=remain%10;
        if (n==9) s+="XC";
        if (n>=5 &&n<=8) {
            s+="L";
            for(int i=5;i<n;i++){
                s+="X";
            }
        }
        if (n==4){
            s+="XL";
        }
        if (n>=1&&n<=3){
            for(int i=0;i<n;i++){
                s+="X";
            }
        }
        n=remain;
        if (n==9) s+="IX";
        if (n>=5 &&n<=8) {
            s+="V";
            for(int i=5;i<n;i++){
                s+="I";
            }
        }
        if (n==4){
            s+="IV";
        }
        if (n>=1&&n<=3){
            for(int i=0;i<n;i++){
                s+="I";
            }
        }
        return s;
    }
};

