class Solution {
public:
    int XXX(int m, int n) {
        vector<int> pre(m,1);
        vector<int> cur(m,1);

        for (int k=1; k<n; k++) {
            for (int i=1; i<m; i++) {
                cur[i] = pre[i] + cur[i-1];
            }
            pre = cur;
            std::fill(std::begin(cur),std::end(cur),1);
        }

        return pre[m-1];        
    }
};

