 class Solution {
public:
    string XXX(string s, int numRows) {
        if(numRows == 1) return s;
        string num[numRows];
        int k = numRows*2 - 2;
        for(int i = 0; i < s.length(); i++) {
            int te = i%k >= numRows? k -(i%k): i%k;
            num[te] += s[i];
        }
        for(int i = 1; i < numRows; i++){
            num[0] += num[i];
        }
        return num[0];
    }
};

