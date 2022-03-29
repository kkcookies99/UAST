class Solution {
public:
    int XXX(string s) {
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if(s[i]=='V') cnt+=5;
            else if(s[i]=='L') cnt+=50;
            else if(s[i]=='D') cnt+=500;
            else if (s[i]=='M') cnt+=1000;
            else if (s[i]=='I'){
                if(i+1<=s.length()-1){
                    if(s[i+1]=='V'){
                        cnt+=4;
                        i+=1;
                    }
                    else if(s[i+1]=='X'){
                        cnt+=9;
                        i+=1;
                    }
                    else cnt+=1;
                }
                else cnt+=1;
            }
            else if (s[i]=='X'){
                if(i+1<=s.length()-1){
                    if(s[i+1]=='L'){
                        cnt+=40;
                        i+=1;
                    }
                    else if(s[i+1]=='C'){
                        cnt+=90;
                        i+=1;
                    }
                    else cnt+=10;
                }
                else cnt+=10;
            }
            else if (s[i]=='C'){
                if(i+1<=s.length()-1){
                    if(s[i+1]=='D'){
                        cnt+=400;
                        i+=1;
                    }
                    else if(s[i+1]=='M'){
                        cnt+=900;
                        i+=1;
                    }
                    else cnt+=100;
                }
                else cnt+=100;
            }
        }
        return cnt;
    }
};

