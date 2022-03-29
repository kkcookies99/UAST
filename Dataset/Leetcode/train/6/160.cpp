 class Solution {
public:
    string XXX(string s, int numRows) {
        if(numRows == 1) return s;
        string ans;
        for(int i = 0; i < numRows; ++i){
            int idx = i;
            if(i == 0 || i == numRows-1){
                while(idx < s.size()){
                    ans += s[idx];
                    idx += 2 * (numRows - 1);
                }
            }else{
                while(idx < s.size()){
                    ans += s[idx];
                    int it = idx + 2*(numRows-i-1);
                    if(it < s.size()) ans += s[it];
                    idx += 2 * (numRows - 1);
                }
            }
        }
        return ans;
    }
};

