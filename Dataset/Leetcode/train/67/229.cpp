 class Solution {
public:
    vector<int> add(vector<int>& A, vector<int>& B) {
        if (A.size() < B.size()) return add(B, A);
        vector<int> c;
        int t = 0;
        for (int i = 0; i < (int)A.size(); i++) {
            t += A[i];
            if (i < B.size()) t += B[i];
            c.push_back(t % 2);
            t /= 2;
        }
        if (t) c.push_back(t);
        while (c.size() > 1 && c.back() == 0) c.pop_back();
        return c;
    }

    string XXX(string a, string b) {
        vector<int> A, B;
        for (int i = a.size() - 1; i >= 0; i--) A.push_back(a[i] - '0');
        for (int i = b.size() - 1; i >= 0; i--) B.push_back(b[i] - '0');

        vector<int> res = add(A, B);
        string ans;
        for (int i = res.size() - 1; i >= 0; i--) {
            ans += res[i] + '0';
        }
        return ans;
    }
};

