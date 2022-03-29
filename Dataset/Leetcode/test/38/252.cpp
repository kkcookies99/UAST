class Solution {
public:
    string XXX(int n) {
        string q[31];
        q[1] = "1";
        for(int i = 2; i <= n; i ++) {
            string t = q[i - 1];
            int m = t.size();
            string r;
            for(int j = 0, k = 0; j < m; j ++, k = j) {
                while(k + 1 < m && t[k] == t[k + 1]) k ++;
                r += to_string(k - j + 1) + t[j];
                j = k;
            }
            q[i] = r;
        }
        return q[n];
    }
};

