 class Solution {
public:
    string XXX(int n) 
    {
            if (n == 1)
        return "1";
    string ans = "1";
    for (int i = 2; i <= n; ++i)
    {
        string temp;
        int n = 1; //重复次数
        for (int j = 0; j < ans.size(); ++j)
        {
            if (ans[j + 1] == ans[j])
            {
                ++n;
                continue;
            }
            else
            {
                temp += to_string(n) + ans[j];//有n个ans[j]
                n = 1;//刷新重复次数
            }
        }
        ans = temp;
    }
    return ans;
    }
};

