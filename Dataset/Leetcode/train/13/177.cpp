class Solution {
public:
    int XXX(string s) {
        int num=0;
        for(int i=0;i<s.length();i++)
        {
            if(s[i] =='M' && s[i-1]!='C') num+=1000;
            else if(s[i]=='C' && s[i+1]=='M') num+=900;
            else if (s[i]=='D' && s[i-1]!='C') num+=500;
            else if (s[i]=='C'&& s[i+1]=='D') num+=400;
            else if (s[i]=='C' && s[i-1]!='X') num+=100;
            else if (s[i]=='X' && s[i+1]=='C') num+=90;
            else if (s[i]=='L' && s[i-1]!='X') num+=50;
            else if (s[i]=='X' && s[i+1]=='L') num+=40;
            else if (s[i]=='X' && s[i-1]!='I') num+=10;
            else if (s[i]=='I' && s[i+1]=='X') num+=9;
            else if (s[i]=='V' && s[i-1]!='I') num+=5;
            else if (s[i]=='I' && s[i+1]=='V') num+=4;
            else if (s[i]=='I') num+=1;
        }
        return num;
    }
};

