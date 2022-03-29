 class Solution {
public:
    int XXX(int m, int n) {
        vector<int> line(n, 1);
        for (int i = m - 2; i >= 0; i--)
            for (int j = n - 2; j >=0; j--)
                line[j] += line[j + 1];
        return line[0];
    }
};

