 class Solution {
    vector<string> res;
public:
    vector<string> XXX(int n) {
        string s;
        int left = 0, right = 0;
        backTrace(s, n, left, right);
        return res;   
    }

    void backTrace(string& s, int& n, int& left, int& right)
    {
        if (left == n && right == n)
        {
            res.emplace_back(s);
            return ;
        }

        for (int i = 0; i < 2; i++)
        {
            if (i == 0)
            {
                if (left == n) continue;

                left++;
                s += "(";
                backTrace(s,n,left, right);
                s.pop_back();
                left--;
            }

            if (i == 1)
            {
                if (left == right) continue;

                right++;
                s += ")";
                backTrace(s,n, left, right);
                s.pop_back();
                right--;
            }
        }
    }
};

