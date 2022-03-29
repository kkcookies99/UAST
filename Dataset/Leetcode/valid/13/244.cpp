class Solution {
public:
    int XXX(string s) {
        unordered_map<char, int> hash={
        {'M',1000},
        {'CM',900},
        {'D',500},
        {'CD',400},
        {'C',100},
        {'XC',90},
        {'L',50},
        {'XL',40},
        {'X',10},
        {'IX',9},
        {'V',5},
        {'IV',4},
        {'I',1},
    };
    int ans=0,n=s.size();
    for(int i=0;i<n;++i){
        if(s[i]=='C'&&s[i+1]=='M')  {ans+=900;i++;continue;}
        if(s[i]=='C'&&s[i+1]=='D')  {ans+=400;i++;continue;}
        if(s[i]=='X'&&s[i+1]=='C')  {ans+=90;i++;continue;}
        if(s[i]=='X'&&s[i+1]=='L')  {ans+=40;i++;continue;}
        if(s[i]=='I'&&s[i+1]=='X')  {ans+=9;i++;continue;}
        if(s[i]=='I'&&s[i+1]=='V')  {ans+=4;i++;continue;}
        ans+=hash[s[i]];
    }
    return ans;
    }
};

