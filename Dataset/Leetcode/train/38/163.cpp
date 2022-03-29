class Solution {
public:
    int equal_cnt(int idx, string& s) {
        char target_c = s[idx];
        int cnt = 1;
        for(int i = idx + 1; i < s.size(); ++i, ++cnt) {
            if(target_c != s[i]) break;
        }
        return cnt;
    }
    
    string XXX(int n) {
        string ans = "1", buf = "1";
        while(n > 1) {
            string _buf;
            for(int j = 0; j < buf.size();) {
                int cnt = equal_cnt(j, buf);
                
                _buf += to_string(cnt) + buf[j];
                j += cnt;
            }
            buf = _buf;
            n--;
        }
        
        ans = buf;
        return ans;
    }
};

