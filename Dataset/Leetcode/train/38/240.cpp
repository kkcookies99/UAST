class Solution {
public:
    string kernal(string cur, int d) {
        if(d == 1) return cur;
        int i = 0, n = cur.size();
        string ans;
        char last = cur[0];
        while(i < n) {
            int j = i + 1;
            last = cur[i];
            while(j < n && cur[j] == last) ++j;
            ans += to_string(j - i) + last;
            i = j;
        }
        return kernal(ans, d-1);
    }
    string XXX(int n) {
        if(n == 1) return "1";
        return kernal("1", n);
    }
};```

