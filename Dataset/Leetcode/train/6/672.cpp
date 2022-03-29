 class Solution {
public:
    string XXX(string s, int numRows) {
        if(numRows == 1)
            return s;
        string ans;
        int len = s.size();
        for(int i = 0;i < len;i += (numRows - 1) * 2)
            ans += s[i];
        for(int i = 2;i < numRows;i++){
            bool flag = true;
            int step1 = numRows * 2 - 2 * i;
            int step2 = i * 2 - 2;
            for(int j = i - 1;j < len;){
                ans += s[j];
                if(flag){
                    flag = false;
                    j += step1;
                }
                else{
                    flag = true;
                    j += step2;
                }
            }
        }
        for(int i = numRows - 1;i < len;i += (numRows - 1) * 2)
            ans += s[i];
        return ans;
    }
};

