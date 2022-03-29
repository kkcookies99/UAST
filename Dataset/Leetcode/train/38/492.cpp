 class Solution {
public:
    string XXX(int n) {
        if (n == 1) return "1";
        string cur = "1";
        for (int i = 2; i <= n; i++) {
            string tmp = "";
            int first = 0, last = 0;
            while (last < cur.size()) {
                if (cur[first] == cur[last]) {
                    last = last + 1;
                }
                else {
                    tmp = tmp + to_string(last - first) + cur[first];
                    first = last;
                }
            }
            tmp = tmp + to_string(last - first) + cur[first];
            cur.assign(tmp.begin(), tmp.end());
        }
        return cur;
    }
};

