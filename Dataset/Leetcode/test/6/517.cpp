 class Solution {
public:
    string XXX(string s, int numRows) {
        if(numRows == 1) return s;
        string ans = "";
        int n = s.size(), step = 2 * numRows - 2;
        for(int i = 0; i<numRows; ++i){
            int jump = 2*(numRows - (i+1)); 
            for(int j = i; j<n; j+=step){
                ans += s[j];
                if(jump > 0 && jump <step && j+jump <n) ans += s[j+jump];
            }
        }
        return ans;
    }
};

