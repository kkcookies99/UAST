 class Solution {
public:
    int N;
    vector<string> res;
    vector<string> XXX(int n) {
        N = n;
        DFS("", 0, 0);
        return res;
    }

    void DFS(string combine, int left, int right) {
        if (right > left || left > N) return;
        if (right == N && left == N) {
            res.push_back(combine);
            return;
        }
        combine += "(";
        DFS(combine, left + 1, right);
        combine = combine.substr(0, combine.size()-1);
        combine += ")";
        DFS(combine, left, right + 1);
    }
};

