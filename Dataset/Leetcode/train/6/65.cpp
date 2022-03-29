 class Solution {
public:
    string XXX(string s, int numRows) {
        if(numRows <= 1) return s;
        int T = (numRows - 2) * 2 + 2;
        string res = "";
        for(int i = 0; i < numRows; ++i){
            int cnt = 0;
            while(1){
                if(cnt * T + i < s.size()) {
                    res += s[cnt * T + i];
                }else{
                    break;
                }
                if(i == 0 || i == T / 2) {cnt++;continue;}
                if(cnt * T + T - i < s.size()) {
                    res += s[cnt * T + T - i];
                }else{
                    break;
                }
                cnt++;
            }
        }
        return res;
    }
};```

