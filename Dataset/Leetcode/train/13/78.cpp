class Solution {
public:
    int XXX(string s) {      
        int num = 0;
        for(int n=0;n<s.size();n++){
            if(s[n] == 'I'){
                if(s[n+1] == 'V'){
                    num = num+4;
                    n++;
                }else if(s[n+1] == 'X'){
                    num = num+9;
                    n++;
                }else{
                    num = num+1;
                }
            }else if(s[n] == 'V'){
                num = num+5;
            }else if(s[n] == 'X'){
                if(s[n+1] == 'L'){
                    num = num+40;
                    n++;
                }else if(s[n+1] == 'C'){
                    num = num+90;
                    n++;
                }else{
                    num = num+10;
                }
            }else if(s[n] == 'L'){
                num = num+50;
            }else if(s[n] == 'C'){
                if(s[n+1] == 'D'){
                    num = num+400;
                    n++;
                }else if(s[n+1] == 'M'){
                    num = num+900;
                    n++;
                }else{
                    num = num+100;
                }
            }else if(s[n] == 'D'){
                num = num+500;
            }else if(s[n] == 'M'){
                num = num+1000;
            }
        }
        return num;
    }
};

