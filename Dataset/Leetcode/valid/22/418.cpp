 class Solution {
public:
    vector<string> XXX(int n) {
        vector<string> res;
        if (n == 1)
        {
            res.push_back("()");
            return res;
        }
        else
        {
            vector<string> _res = XXX(n - 1);
            for (int i = 0; i < _res.size(); i++)
            {
                res.push_back("(" + _res[i] + ")");
                res.push_back("()" + _res[i]);
                if (_res[i] + "()" != "()" + _res[i]) res.push_back(_res[i] + "()");
            }
            return res;
        }
    }
};

