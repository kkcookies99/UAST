class Solution {
public:
    string XXX(int n) {
        string say = "1", s = "";
        for (int j = 2 ; j <= n; j++) {
            for (int i = 1, cnt = 1; i <= say.size(); i++) {
                if (say[i - 1] != say[i]) {
                    s.push_back(cnt + '0');
                    s.push_back(say[i-1]);
                    cnt = 1;
                } else {
                    cnt++;
                }
            }
            say = s;
            s = "";
        }
        return say;
    }
};

