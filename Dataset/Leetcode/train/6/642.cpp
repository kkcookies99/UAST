 class Solution {
public:
    string XXX(string s, int numRows) {
        int i,step = 2*numRows-2,row,len = s.length();
        string ret;
        if(numRows==1){
            return s;
        }
        for(row=0;row<numRows;row++){
            for(i=row;i<len;i+=step){
                ret+=s[i];
                if(row!=0 && row!=numRows-1 && i+step-row-row<len){
                    ret+=s[i+step-row-row];
                }
            }
        }
        return ret;

    }
};

