 class Solution {
public:
    string XXX(string s, int numRows) {
        vector<string> store(numRows, "");
        string ret;
        int len = s.size();

        if(s.empty()||numRows<1){
            return ret;
        }

        if(numRows == 1){
            return s;
        }

        for(int i=0; i<len; ){
            int postive = numRows;
            int negtive = numRows-2;

            for(int j=0; i<len&&j<postive; i++,j++){
                store[j]+=s[i];
            }
            for(int j=0; i<len&&j<negtive; i++,j++){
                store[numRows-2-j]+=s[i];
            }
        }

        for(int i=0; i<numRows; i++){
            ret = ret + store[i];
        }
        return ret;
    }
};

