class Solution {
public:
    void XXX(vector<int>& a) {
        int n = a.size();
        int m1 = 0;
        int m2 = n;
        // [0, m1) 0
        // [m1, m2) 1
        // [m2, n) 2;
        for (int i = 0; i < m2; i++) {
            if (a[i] == 0) {
                swap(a[m1], a[i]);
                m1++;
            } else if (a[i] == 2) {
                swap(a[m2 - 1], a[i]);
                m2--;
                i--;
            }
        }
    }
};

