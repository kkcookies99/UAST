 class Solution {
public:
    string XXX(string s, int numRows) {
        string result;
        if(numRows == 1)   return s;
        int temp = 2 * numRows - 2;
        for(int i = 0 ; i < numRows; i++) {
            for(int j = 0; j < s.size(); j++) {
                if(((j+i) % temp == 0) || ((j-i) % temp == 0)){
                    result += s[j];
                }
            }
        }
        return result;
    }
};

