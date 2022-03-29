class Solution {
    string recursion(string prev, int n) {
        if (n == 1) {
            return prev;     
        }
        string buffer;
        int i(0),size(prev.size());
        while (i < size) {
            char cur(prev[i]);
            int j;
            for (j = i; j < size && prev[j] == cur; ++j) {}
            buffer += '0' + j - i;
            buffer += cur;
            i = j;
        }
        return recursion(buffer, n - 1);
    }
public:
    string XXX(int n) {
        return recursion("1",n);
    }
};

