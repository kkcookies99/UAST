class Solution {
public:
    string XXX(int n) {
        string ans = "1";
        string tmp = "";
        while(--n > 0) {
            char c = ans[0];
            int count = 0;
            for(auto & ch : ans) {
                if(ch == c) {
                    count++;
                }else {
                    tmp += to_string(count) + c;
                    c = ch;
                    count = 1;
                }
            }
            tmp += to_string(count) + ans[ans.size() - 1];
            ans.clear();
            swap(ans, tmp);
        }
        return ans;
    }
};

