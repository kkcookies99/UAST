class Solution {
public:
    int XXX(string s) {
        if(s.size()==0) return 0;
        int sum=0;
        for(int i=0;i<s.size();i++){
            
            if(s[i]=='I'&&(s[i+1]=='V'||s[i+1]=='X')) sum-=1;
            else if(s[i]=='X'&&(s[i+1]=='L'||s[i+1]=='C')) sum-=10;
            else if(s[i]=='C'&&(s[i+1]=='D'||s[i+1]=='M')) sum-=100;
            else if(s[i]=='I') sum+=1;
            else if(s[i]=='V') sum+=5;
            else if(s[i]=='X') sum+=10;
            else if(s[i]=='L') sum+=50;
            else if(s[i]=='C') sum+=100;
            else if(s[i]=='D') sum+=500;
            else if(s[i]=='M') sum+=1000;
        }     
        return sum;
    }
};

