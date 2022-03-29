class Solution {
public:
    int XXX(string s) {
    int sum=0;
    int length=s.size();
    for(int i=1;i<=length;i++){
        if(s[i-1]=='M')sum+=1000;
        if(s[i-1]=='D')sum+=500;
        
        if(s[i-1]=='C'){
            if(s[i]=='M'||s[i]=='D') sum-=100;
            else sum+=100;
        }
        
        if(s[i-1]=='L')sum+=50;
        
        if(s[i-1]=='X'){
            if(s[i]=='L'||s[i]=='C') sum-=10;
            else sum+=10;
        }
        if(s[i-1]=='V')sum+=5;
        
        if(s[i-1]=='I'){
            if(s[i]=='V'||s[i]=='X') sum-=1;
            else sum+=1;
        }
    }
    return sum;
    }
};

