 class Solution {
public:
    vector<string> XXX(int n)
    {
        vector<string> ans={"("};
        vector<int> left = {1};
        for (int i = 1; i <= n * 2; ++i)
        {
            int last = ans.size();
            for (int j = 0; j < last; ++j)
            {
                // Add left bracket
                if (left[j] + 1 < n * 2 - i)
                {
                    ans[j] += "(";
                    left[j]++;
                }
                // Add right bracket
                if ((left[j] == 1 && ans[j].size() == i) || (left[j] > 1))
                {
                    if (ans[j].size() == i + 1)
                    {
                        string tempStr = ans[j];
                        tempStr[tempStr.size() - 1] = ')';
                        ans.push_back(tempStr);
                        left.push_back(left[j]-2);
                    }
                    else
                    {
                        ans[j]+= ")";
                        left[j]--;
                    };
                }
            }
        }
        return ans;
    }
};

