 class Solution {
public:
    string XXX(string s, int numRows) {
        if(numRows==1)return s;
        string str[numRows];
        int n=0,dir=1;
        for(int i=0;i<s.size();++i){
            if(n==numRows-1)dir=-1;
            if(n==0)dir=1;
            str[n]+=s[i];
            n+=dir;
        }
        for(int i=1;i<numRows;++i){
            str[0]+=str[i];
        }
        return str[0];
    }
};

