 class Solution {
public:
    string XXX(string s, int numRows) {
        string res;
        int row,f1,f2;
        int flag=1;
        if(numRows==1) return s;
        for(int i=0;i<s.length();i=i+(numRows-1)*2){
            res+=s[i];
        }          
        for(int row=1;row<numRows-1;row++){
            res+=s[row];
            f1=(numRows-1-row)*2;
            f2=2*row;
            for(int j=row;j<s.length(); ){
                j=j+f1;
                if(j<s.length()) res+=s[j];
                else break;
                j=j+f2;
                if(j<s.length()) res+=s[j];
                else break;
            }
        }       
        for(int k=numRows-1;k<s.length();k=k+2*(numRows-1)){
            res+=s[k];
        }
        return res;
    }  
};

