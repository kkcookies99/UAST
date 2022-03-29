class Solution {
public:
    // 计算连续相同数字数量+该数字
    string XXX(int n) {
        string res = "1", t;
        if(n == 1) return res;
        while(--n) {
            int cnt = 0, i = 0, j = 0;
            while(j < res.size()) {
                if(res[i] == res[j]) {
                    ++cnt;
                    ++j;
                }
                else {
                    i = j;
                    t += to_string(cnt);
                    t.push_back(res[j - 1]);
                    cnt = 0;
                }
                if(j == res.size()) {
                    t += to_string(cnt);
                    t.push_back(res[j - 1]);
                    break;
                }
            }
            res = t;
            t.clear();
        }
        return res;
    }
};

