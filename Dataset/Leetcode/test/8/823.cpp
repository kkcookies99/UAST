 class Solution {
public:
    int XXX(string str) {
        char sig = '+';
        int ascii,r=0,sigNUM=0,sig0NUM=0;
        for (int i = 0; i < str.size(); i++) {

            if (str[i] == ' '){
                if(i==0)
                    continue;
                else{
                        if(r==0&&sig0NUM<1&&str[i-1]!='-' && str[i-1]!='+')
                            continue;
                        else
                            break;
                    }
            }
            else if (str[i] == '-'&&sig0NUM<1) {
                sig = '-';
                sigNUM++;
            }
            else if(str[i]=='+'&&sig0NUM<1){
                sig='+';
                sigNUM++;
            }
            else if (str[i] >= '0'&&str[i] <= '9' &&sig=='+'&&sigNUM<2) {
                ascii = str[i];
                if (r>INT_MAX/10  || (r==INT_MAX/10 && (ascii-48)>7) ) return INT_MAX;
                r = r * 10 + (ascii - 48);
                sig0NUM++;
            }
            else if(str[i] >= '0'&&str[i] <= '9' &&sig=='-'&&sigNUM<2){
                ascii = str[i];
                if (r<INT_MIN/10  || (r==INT_MIN/10 && (ascii-48)>8) ) return INT_MIN;
                r = r * 10 -( ascii - 48);    
                sig0NUM++;
            }
            else {
                break;
            }

        }

 
        return r;
	
    }
};

