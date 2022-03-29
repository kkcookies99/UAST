 class Solution {
public:
    int nsize;
    vector<vector<int>> ret;
    void generatePos(int k, int left, const vector<int> & p)
    {
        if(k == 0) 
        {
            ret.push_back(p);
        }
        
        for(int i = left+1; i < 2*nsize-1; i++)
        {
            vector<int> cop = p;
            cop[i] = 1;
            generatePos(k-1, i, cop);
        }

    }

    vector<string> XXX(int n) {
        nsize = n;
        generatePos(n, -1, vector<int>(n*2, 0));

        vector<string> ans;
        for(const auto & p: ret)
        {

            string s = string("");
            int sign = 0;
            for(const auto i : p)
            {
                if(i == 1)
                {
                    s += "(";
                    sign ++;
                }
                else
                {
                    s += ")";
                    sign--;
                }
                if (sign < 0)
                break;
            }
            if(sign == 0) ans.push_back(s);
        }

        return ans;
    }
};

