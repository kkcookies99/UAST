 class Solution {
public:
    void XXX(vector<int>& n1, int m, vector<int>& n2, int n) {
        int a = m - 1, b = m + n - 1, c = n - 1;
        while (a >= 0 && c >= 0) {
            if (n1[a] >= n2[c]) n1[b--] = n1[a--];
            else n1[b--] = n2[c--];
        }

        while (c >= 0) n1[b--] = n2[c--];
    }
};

