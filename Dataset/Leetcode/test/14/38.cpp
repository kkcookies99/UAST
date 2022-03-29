 class Solution {
public:
    string XXX(vector<string>& strs) {
        string res = "";
        int min_len = INT_MAX;
        for(int i = 0; i < strs.size(); i++) {
            int len = strs[i].size();
            min_len = min(min_len, len);  // 找出最短单词的长度
        }
        // 按照一列一列的方式逐个比较
        for(int i = 0; i < min_len; i++) {
            int f = 0;
            for(int j = 0; j < strs.size(); j++) {
                if(j > 0 && strs[j][i] != strs[j-1][i]) {
                    f = 1;
                    break;
                }
            }
            if(f == 1) return res;
            else res += strs[0][i];
        }
        return res;
    }
};

