class Solution {
public:
    string XXX(int n) {
        string res;
        if (n == 1) return "1";
        string pre = XXX(n - 1);
        int size = pre.size();
        for (int i = 0; i < size; i++) {
            int j = i + 1;
            while (j < size && pre[i] == pre[j]) ++j;
            res += to_string(j - i);
            res += pre[i];
            i = j - 1;
        }
        return res;
    }
};

