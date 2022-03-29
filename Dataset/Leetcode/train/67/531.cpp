class Solution {
public:
    string XXX(string a, string b) {
        int len1 = a.size(), len2 = b.size();
        string res;
        int i = len1 - 1, j = len2 - 1, loc = 0;
        int cnt = 0;
        while(i >= 0 && j >= 0){
            int tmp = (a[i] - '0') + (b[j] - '0') + cnt;
            res.push_back(tmp % 2 + '0');
            cnt = tmp / 2;
            --i;--j;
        }
        while(i >= 0){
            int tmp = a[i] - '0' + cnt;
            res.push_back(tmp % 2 + '0');
            cnt = tmp / 2;
            --i;
        }
        while(j >= 0){
            int tmp = b[j] - '0' + cnt;
            res.push_back(tmp % 2 + '0');
            cnt = tmp / 2;
            --j;
        }
        if(cnt){
            res.push_back('1');
        }
        int len = res.size();
        for(int t = 0; t < len / 2; ++t){
            char ch = res[t];
            res[t] = res[len - t - 1];
            res[len - t - 1] = ch;
        }

        return res;
    }
};

