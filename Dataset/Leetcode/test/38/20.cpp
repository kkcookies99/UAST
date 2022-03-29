class Solution {
public:
    string XXX(int n) {
        string s = "1";
        while (--n) {
            int len = s.size();
            string next = "";
            char cur = s[0];
            int cnt = 1;
            for (int i = 1; i < len; ++i) {
                if (s[i] == cur) {
                    ++cnt;
                } else {
                    next += to_string(cnt);
                    next.push_back(cur);
                    cur = s[i];
                    cnt = 1;
                }
            }
            next += to_string(cnt);
            next.push_back(cur);
            // cout << "s = " << s << ", next = " << next << endl;
            s = next;
            
        }
        return s;
    }
};

