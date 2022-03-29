 class Solution {
public:
    string res;
    void dfs(string s, int n, int count) //递归
    {
        if(count == n)
        {
            res = s;
            return;
        }
        string curstr = "";
        int num = 0;
        for(int i = 0; i < s.size() - 1; i++)
        {
            if(s[i + 1] == s[i])
            {
                num++;
            }
            else
            {
                curstr = curstr + to_string(num + 1) + s[i];
                num = 0;
            }
        }
        curstr = curstr + to_string(num + 1) + s[s.size() - 1];
        num = 0;
        dfs(curstr, n, count + 1);
    }

    string itr(string s, int n) //循环
    {
        int num = 0;
        string ans = "";
        for(int i = 1; i < n; i++)
        {
            for(int j = 0; j < s.size() - 1; j++)
            {   
                if(s[j + 1] == s[j])
                {
                    num++;
                }
                else
                {
                    ans = ans + to_string(num + 1) + s[j];
                    num = 0;
                }
            }
            ans = ans + to_string(num + 1) + s[s.size() - 1];
            num = 0;
            s = ans;
            ans = "";
        }

        ans = s;
        return ans;
    }

    string XXX(int n) {
         dfs("1", n, 1);
         return res;
        //return itr("1", n);
    }
};

