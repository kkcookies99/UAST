 class Solution {
public:
    string XXX(int n) {
        if(n == 1) return "1";
        string ans = "1";
        for(int i = 1; i < n; i++)
            ans = getTarget(ans);
        return ans;
    }

    string getTarget(string s){
        string ans;
        char tmp = s[0];
        int cnt = 0;
        for(int i = 0; i < s.size(); i++){
            if(s[i] != tmp){
                ans += to_string(cnt);
                ans += tmp;
                cnt = 1;
                tmp = s[i];
            }
            else ++cnt;
        }
        if(cnt){
            ans += to_string(cnt);
            ans += tmp;
        }
        return ans;
    }
};

