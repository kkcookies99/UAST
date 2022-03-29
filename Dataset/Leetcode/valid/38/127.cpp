class Solution {
public:
    string solution(int n, string res)
    {
        string rst = "";
        if(n == 1) return res;
        else
        {
            int now = res[0] - '0';
            int count = 1;
            int len = res.size();
            for(int i = 1; i < len; i++)
            {
                if(res[i] - '0' != now)
                {
                    rst += count + '0';
                    rst += now + '0';
                    now = res[i] - '0';
                    count = 1;
                }
                else count++;
            }
            rst += count + '0';
            rst += now + '0';
            now = res[len - 1] - '0';
            count = 1;
        }
        return solution(n - 1, rst);
    }
    string XXX(int n) {
        return solution(n, "1");
    }
};

