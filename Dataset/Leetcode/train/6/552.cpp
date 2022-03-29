 class Solution {
public:
    string XXX(string s, int numRows) {
        if(numRows==1) return s;
        int N = 2*numRows-2;
        string new_str = "";
        for(int i=0;i<numRows;i++){
            if(i==0||i==numRows-1){
                for(int j=0;j<=s.size()/N;j++){
                    if(i+j*N < s.size()) new_str = new_str + s[i+j*N];
                } 
            }
            else{
                for(int j=0;j<=s.size()/N;j++){
                    if(i+j*N<s.size()) new_str = new_str + s[i+j*N];
                    if((j+1)*N-i<s.size()) new_str = new_str + s[(j+1)*N-i];
                }
            }
        }
        return new_str;
    }
};

