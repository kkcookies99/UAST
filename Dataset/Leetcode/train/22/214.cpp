 class Solution {
public:
    vector<string> XXX(int n)
    {
        pi.first = 0;
        pi.second = 0;
        size = n * 2;
        backtrace(n);
        return res;
    }

private:
    int size;
    string path;
    vector<string> res;
    pair<int, int> pi;
private:
    void backtrace(int n)
    {
        if (size == (pi.second + pi.first))
        {
            res.push_back(path);
            return;
        }
        if (0 == pi.first && 0 == pi.second)
        {
            path.push_back('(');
            ++pi.first;
        }
        if (pi.first < n)
        {
            path.push_back('(');
            ++pi.first;
            backtrace(n);
            path.pop_back();
            --pi.first;
        }
        if (pi.first > pi.second)
        {
            path.push_back(')');
            ++pi.second;
            backtrace(n);
            path.pop_back();
            --pi.second;
        }
    }
};


