 class Solution {
public:
    string XXX(string s, int numRows) {  
        int length=s.length();
        if(numRows>=length||numRows<2) return s;
        string ans;
        for( int row=0;row<numRows;row++){
            int i=row;
            if(row==0||row==numRows-1){
                while(i<length){
                    ans+=s[i];
                    i+=numRows*2-2;
                }
            }
            else{
                while(i<length){
                 ans+=s[i];
                 i+=(numRows-row-1)*2;
                    if(i<length){
                        ans+=s[i];
                        i+=row*2;
                    }
                }
            }
        }
        return ans;     
    }
};

