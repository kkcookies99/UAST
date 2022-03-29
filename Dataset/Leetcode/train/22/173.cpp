 class Solution {
public:
    vector<string> XXX(int n) {
        vector<string> par;
        vector<vector<string>> ret(n + 1, par);
        ret[0] = par;
        par.push_back("()");
        ret[1] = par;
        for (int i = 2; i <= n; i ++)
        {
            vector<string> temp;
            for (int j = 1; j <= 2 * i; j = j + 2)
            {
                int former = (j - 1) / 2;
                int latter = (2 * i - j - 1) / 2;
                if (former == 0 && latter != 0)
                {
                    for (int l = 0; l < ret[latter].size(); l ++)
                    {
                        string str = "()";
                        str += ret[latter][l];
                        temp.push_back(str);
                    }
                }
                else if (former != 0 && latter == 0)
                {
                    for (int k = 0; k < ret[former].size(); k ++)
                    {
                        string str = "(";
                        str += ret[former][k];
                        str += ")";
                        temp.push_back(str);
                    }
                }
                else
                {
                    for (int k = 0; k < ret[former].size(); k ++)
                    {
                        for (int l = 0; l < ret[latter].size(); l ++)
                        {
                            string str = "(";
                            str += ret[former][k];
                            str += ")";
                            str += ret[latter][l];
                            temp.push_back(str);
                        }
                    }
                }
            }
            ret[i] = temp;
        }
        return ret[n];
    }
};

